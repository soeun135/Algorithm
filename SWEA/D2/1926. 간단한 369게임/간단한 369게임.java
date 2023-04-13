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
		//3,6,9 3의 배수가 들어간 횟수만큼 --출력
		
		for(int i=1;i<=num;i++) {
			String str = Integer.toString(i);
			int ch  =0;
			char c='a';
			for(int j=0;j<str.length();j++) {
				c = str.charAt(j);
				if(c=='3' || c=='6' ||c=='9') 
					ch++;
			}
			if(ch != 0) //3이 하나라도 들어가있을 때
				for(int k=0;k<ch;k++) 
					System.out.print("-");
			else //3이 안들어가있으면
				System.out.print(i);
			System.out.print(" ");
		}
	}
}