import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); //테스트 케이스
		
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			int result = 0;
			int N = Integer.parseInt(br.readLine());
			int speed = 0; //현재속도
			for(int j=0;j<N;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int ch = Integer.parseInt(st.nextToken());
				if(ch != 0) {
					int m_ss = Integer.parseInt(st.nextToken()); ///rc카 속도

					if(ch == 1) { //가속
						result += speed+m_ss;
						speed += m_ss;
					}
					else if(ch==2){ //감속
						if(speed < m_ss) {
							speed = 0;
							continue;
						}
						else {
							result += speed-m_ss;
							speed -= m_ss;
						}
					}
				}
				else { //현재속도 유지
					result += speed;
				}
			}
			System.out.println("#"+i+" "+result);
		}//하나의 테스트 케이스 끝
		
	}
}