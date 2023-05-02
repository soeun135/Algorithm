import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int farr[][] = new int[N][M];
    	int sarr[][] = new int[N][M];

    	int resultarr[][] = new int[N][M];
    	
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0;j<M;j++) {
    			farr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0;j<M;j++) {
    			sarr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<M;j++) {
    			resultarr[i][j] = farr[i][j]+sarr[i][j];
    		}
    	}
    	
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<M;j++) {
    			System.out.print(resultarr[i][j]);
    			if(j != M-1) {
    				System.out.print(" ");
    			}
    		}
    		System.out.println(" ");
    	}
	}
}