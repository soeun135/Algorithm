import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
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
		
		int T = Integer.parseInt(br.readLine()); //테스트 케이스
	
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			int N = Integer.parseInt(br.readLine());
			int arr[][] = new int[N][N];
			int arr_90[][] = new int[N][N];
			int arr_180[][] = new int[N][N];
			int arr_270[][] = new int[N][N];
			
			for(int j=0;j<N;j++) { // N*N 행렬값 저장
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0;k<N;k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			arr_90 = rotation(arr,N);
			arr_180 = rotation(arr_90,N);
			arr_270 = rotation(arr_180,N);
			
			System.out.println("#"+i+" ");
			
			for(int k=0;k<N;k++) {
				for(int m = 0;m<N;m++) {
					System.out.print(arr_90[k][m]);
				}
				System.out.print(" ");
				for(int m = 0;m<N;m++) {
					System.out.print(arr_180[k][m]);
				}
				System.out.print(" ");
				for(int m = 0;m<N;m++) {
					System.out.print(arr_270[k][m]);
				}
				System.out.println(" ");
			}
		}//하나의 테스트 케이스마다 반복문 끝
	}
	public static int[][] rotation(int arr[][],int N){
		int num[][] = new int[N][N];
		int i=0;
		for(int j=0;j<N;j++) { //열
			int o=0;
			for(int k=N-1;k>=0;k--) { //행
				num[i][o] = arr[k][j];
				o++;
			}
			i++;
		}
		return num;
	}
}