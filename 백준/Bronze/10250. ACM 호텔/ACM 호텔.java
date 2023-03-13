import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int input[][] = new int[num][3];
		StringBuilder sb= new StringBuilder();
		int X=0;
		int Y=0;
		int h=0;
		int w=0;
		int n=0;
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[i][0] = Integer.parseInt(st.nextToken());
			input[i][1] = Integer.parseInt(st.nextToken());
			input[i][2] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<num;i++) {
			h = input[i][0];
			w = input[i][1];
			n = input[i][2];
			if(n % h==0){//층수구하기
				Y=h*100;
				X = n/h;
			}
			else
			{
				Y=(n%h)*100;
				X = (n/h)+1;
			}
			sb.append(Y+X).append("\n");
		}
		System.out.println(sb);
	}
}