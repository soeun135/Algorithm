import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[num][2];
		int count = 0; //나보다 큰 애
		int rank[] = new int[num];
		StringTokenizer st;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}	
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					count++; //나보다 큰 애의 수
				}
				else rank[i] = 1;
			}
			rank[i] = count+1; //같은 등수일 때
			count = 0;
		}
		for(int i=0;i<num;i++) {
			System.out.print(rank[i]+" ");
		}
	}
}
