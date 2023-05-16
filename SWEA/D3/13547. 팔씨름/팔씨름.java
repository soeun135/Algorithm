import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


class Solution{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) {
			String str = br.readLine();
			int count = 0;
			for(int j=0;j<str.length();j++) {
				char c  = str.charAt(j);
				if(c == 'x')
					count ++;
			}
			if(count >=8)
				System.out.println("#"+i+" "+"NO");
			else
				System.out.println("#"+i+" "+"YES");
		}
	}
}