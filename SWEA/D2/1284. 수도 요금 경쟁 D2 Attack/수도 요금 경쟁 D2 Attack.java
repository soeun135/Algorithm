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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken()); //B기본요금
			int R = Integer.parseInt(st.nextToken()); //R리터 초과시
			int S = Integer.parseInt(st.nextToken()); //1리터당 S원
			int W = Integer.parseInt(st.nextToken()); 

			int Aresult =0;
			int Bresult = 0;
			
			//A요금
			Aresult = W*P;

			//B요금
			if( W > R) { //R리터 보다 클 경우
				Bresult = Q; //R리터 만큼만 기본 요금이고
				W -= R;
				
				//나머지 R리터 초과한 부분
				Bresult += W*S;
			}
			else //R리터보다 작은 경우 
				Bresult = Q; //기본요금 Q만큼만
			
			System.out.println("#"+i+" "+(Aresult > Bresult ? Bresult : Aresult));
		}//하나의 테스트 케이스 끝
		
	}
}