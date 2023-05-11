import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			int maxlength = Math.max(str1.length(),str2.length());
			int minlength = Math.min(str1.length(),str2.length());

			int gcf = GCF(maxlength,minlength);
			int lcm = maxlength*minlength/gcf;
			
			String A = str1;
			String B = str2;
			
			while(A.length() != lcm) A+=str1;
			while(B.length() != lcm) B+=str2;

			if(A.equals(B)) System.out.println("#"+i+" "+"yes");
			else System.out.println("#"+i+" "+"no");
		}
		
	}
	public static int GCF(int x,int y) {  //최대공약수
		int r = x % y;
		if(r == 0) {
			return y;
		}
		else {
			return GCF(y,r);
		}
	}
}