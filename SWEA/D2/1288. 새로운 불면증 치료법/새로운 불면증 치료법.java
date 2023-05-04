import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

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
			int num = Integer.parseInt(br.readLine());
			int count = 0;
			int n=1;
			String number = "0123456789";
			String str = "";
			while(!number.equals("!!!!!!!!!!")) {				
				str = Integer.toString(num*n);
				count ++;
				
				for(int j=0;j<str.length();j++) {
					String c = Character.toString(str.charAt(j));
					if(number.contains(c)) {
						number = number.replace(c,"!");
					}
				}
				n++;
			}
			System.out.println("#"+i+" "+str);
		}//하나의 테스트 케이스 끝 
	}
}