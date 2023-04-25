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
			StringTokenizer st  =new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //N*N 퍼즐
			int K = Integer.parseInt(st.nextToken());
			
			int arr[][] = new int[N][N];

			for(int j=0;j<N;j++) { //값 저장
				st = new StringTokenizer(br.readLine());
				
				for(int k = 0;k<N;k++) { //값 저장
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			int result = 0; //들어갈 수 있는 공간을 세는 변수
			
			for(int j=0;j<N;j++) { //1인값 확인	
				int count =0; //한 줄의 빈칸을 세는 변수
				for(int k = 0;k<N;k++) { 
					if(arr[j][k] == 1) { //가로 한 줄 돌았을 때
						count ++;
					}
					else {//공백을 만났을 때
						if(count == K) {
							result += 1;
							count = 0;
						}
						else {
							count = 0;
							continue;
						}
					}
				}
				//공백을 안 만나고 K개로 한 줄이 끝났을 때
				if(count == K) {
					count=0;
					result += 1;
				}
			}//여기까지 가로
			
			//세로
			for(int j=0;j<N;j++) { //1인값 확인	
				int count =0; //한 줄의 빈칸을 세는 변수
				for(int k = 0;k<N;k++) { 
					if(arr[k][j] == 1) { //가로 한 줄 돌았을 때
						count ++;
					}
					else {//공백을 만났을 때
						if(count == K) {
							result += 1;
							count = 0;
						}
						else {
							count = 0;
							continue;
						}
					}
				}
				//공백을 안 만나고 K개로 한 줄이 끝났을 때
				if(count == K) {
					count=0;
					result += 1;
				}
			}//여기까지 세로
			
			System.out.println("#"+i+" "+result);
		}
	}
}