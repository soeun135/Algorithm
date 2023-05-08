import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); //테스트 케이스
		
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			long N = Long.parseLong(br.readLine());
			
			long path = N-1; //최대경로로 초기화
			for(long j=2;j<=Math.sqrt(N);j++) {
				if(N % j == 0) { //나누어 떨어졌다면 N의 약수를 찾은 것
					if(path > (j-1)+(N/j-1)) {
						path = (j-1)+(N/j-1);
					}
				}
			}
			
			System.out.println("#"+i+" "+path);
		}//하나의 테스트 케이스 끝
	}
}