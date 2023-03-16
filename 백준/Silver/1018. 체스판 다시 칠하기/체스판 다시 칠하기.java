import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int wcount = 0;
		int bcount = 0;
		int min=0;
		int miin=100;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		boolean array[][] = new boolean[N][M];
		boolean whiteBoard[][] = new boolean[8][8];
		boolean blackBoard[][] = new boolean[8][8];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
					if(str.charAt(j) =='W')
						array[i][j] = true;
					else
						array[i][j] = false;
			}
		}
		boolean white = true;
		boolean black = false;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				whiteBoard[i][j]= white;
				white = !white;
				blackBoard[i][j] = black;
				black = !black;
			}
			white= !white;
			black =!black;
		}
		for(int q=0;q<=N-8;q++) {
			for(int w=0;w<=M-8;w++){	//System.out.println(q+" "+w);
				wcount =0;
				bcount=0;
				for(int i=0;i<8;i++) {
					for(int j=0;j<8;j++) {
						if(whiteBoard[i][j] !=array[q+i][w+j] ) 
							wcount++;
						if(blackBoard[i][j] != array[q+i][w+j])
							bcount++;
					}
				}
				min = wcount < bcount ? wcount : bcount;
				if(miin > min)
					miin = min;
			}
		}
			System.out.println(miin);
	}
}