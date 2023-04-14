import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
		
		int num = Integer.parseInt(br.readLine());
	
		for(int i=0;i<num;i++) { //테스트 케이스만큼 반복
			int N = Integer.parseInt(br.readLine());
			int arr[][] = new int[N][N];
			arr[0][0] = 1; //첫 번째 줄 값은 1로 고정
			for(int j=1;j<N;j++) { //N개 줄의 삼각형 생김
				for(int k=0;k<=j;k++) {
					if(k-1 >=0 && arr[j-1][k] != 0) { //내 왼쪽에 값이 있고 오른 쪽 위 값이 있으면
						arr[j][k] = arr[j-1][k-1] + arr[j-1][k]; 
					}
					else if(k-1 <0 || arr[j-1][k] ==0){
						arr[j][k] = 1;
					}
				}
			}
			System.out.println("#"+(i+1));
			System.out.println(arr[0][0]);//맨 윗줄 1 출력
			for(int m=1;m<N;m++) {
				for(int n=0;n<=m;n++)
				System.out.print(arr[m][n]+" ");
				
				System.out.println(" ");
			}
		}
	}
}