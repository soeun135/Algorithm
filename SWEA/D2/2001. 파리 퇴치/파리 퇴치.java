import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Solution
{
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("C:\\so_Project\\workspace\\BaekJoon\\src\\algorithm\\input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); //테스트 케이스의 수 
	
		for(int q=1;q<=num;q++) { //테스트 케이스만큼 반복
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int arr[][] = new int[N][N];
			
			for(int w=0;w<N;w++) { //배열에 파리 갯수 값 저장
				st = new StringTokenizer(br.readLine());
				for(int k=0;k<N;k++) 
						arr[w][k] = Integer.parseInt(st.nextToken());				
			}
			
			int max = 0; //잡는 파리의 최댓값
			for(int i =0;i<=N-M;i++) {
				for(int j = 0;j<=N-M;j++){
					int sum = 0;
					for(int k=i;k<i+M;k++) {
						for(int m=j;m<j+M;m++) {
							sum+= arr[k][m];
						}
					}
					if(max<sum)
						max = sum;
				}
			}
			System.out.println("#"+q+" "+max);
		}			
	}
}