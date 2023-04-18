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
		
		int T = Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++) { //테스트케이스만큼 반복
			int ch = 0;
			String str = br.readLine(); //입력받을 단어
			for(int j=0;j<str.length()/2;j++) { //문자열 길이 반만큼 반복
				if(str.charAt(j) != str.charAt(str.length()-1-j))
					ch = 1;
			}
				if(ch==1) //회문 아님 !
					System.out.println("#"+i+" "+0);
				else
					System.out.println("#"+i+" "+1);
		}
	}
}