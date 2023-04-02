import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int num = Integer.parseInt(br.readLine());
		int apart[][] = new int[15][15];
		
		//0층 인원 저장
		for(int i=1;i<apart.length;i++) {
			apart[0][i] = i;
		}
		//1층 1호부터 인원 저장
		for(int i=1;i<15;i++) {
			int number = 0;
			for(int j=1;j<apart[i].length;j++) {
				if(j==1) apart[i][j] = 1;
				else 
				apart[i][j] = apart[i-1][j]+number;
				number = apart[i][j];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++) {
			int k=Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(apart[k][n]+"\n");
		}
		System.out.println(sb);
	}
}