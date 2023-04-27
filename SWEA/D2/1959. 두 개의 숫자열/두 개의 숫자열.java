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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int Aarr[] = new int[N];
			int Barr[]	 = new int[M];
			
			int max = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				Aarr[j] = Integer.parseInt(st.nextToken());
			}
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				Barr[j] = Integer.parseInt(st1.nextToken());
			}
			int n = Math.max(Aarr.length, Barr.length);
			int m = Math.min(Aarr.length, Barr.length);
			for(int j=0;j<=n-m;j++) {
				int sum = 0;
				for(int k=0;k<m;k++) {
					if(Aarr.length < Barr.length)
						sum += (Aarr[k]*Barr[k+j]);
					else
						sum+=(Aarr[k+j]*Barr[k]);
				}
				if(max<sum)
					max = sum;
			}
			System.out.println("#"+i+" "+max);
		}//하나의 테스트 케이스마다 반복문 끝
	}
}