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

				int arr[] = new int[N*N];
				int snail[][] = new int[N][N];
				for(int j=0;j<N*N;j++) {
					arr[j] = j+1;
				}
				
				int ch =0;
				int m=0,n=0,o=0,p;
				
				while(ch < N*N) {
					
					//행 고정 열 증가
					for(n=o;n<N-o;n++) {
						snail[m][n] = arr[ch];
						ch++;
					}n--;
					//행 증가 열 고정
					for(m=o+1;m<N-o;m++) {
						snail[m][n] = arr[ch];
						ch++;
					}m--;
					//행 고정 열 감소
					for(n-=1;n>=o;n--) {
						snail[m][n] = arr[ch];
						ch++;
					}n++;
					//행 감소 열 고정
					for(m-=1;m>=o+1;m--) {
						snail[m][n] = arr[ch];
						ch++;
					}m++;
					
					o++;
				}
				
				System.out.println("#"+i);
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					System.out.print(snail[j][k]+" ");
				}
				System.out.println(" ");
			}
		}//하나의 테스트 케이스마다 반복문 끝
	}
}