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
		
		int T = Integer.parseInt(br.readLine()); //테스트 케이스
		
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			StringTokenizer st  =new StringTokenizer(br.readLine());
			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken()); 
			int m2 = Integer.parseInt(st.nextToken());
			
			//분 더하기
			int h = h1+h2;
			int m = m1+m2;
			if(m >60) {
				h += m/60;
				m = m - (m/60)*60;
			}
			else if(m == 60 ) {
				h++;
				m = 0;
			}
			if(h>12) {
				h-=12;
			}
			System.out.println("#"+i+" "+h+" "+m);
		}
	}
}