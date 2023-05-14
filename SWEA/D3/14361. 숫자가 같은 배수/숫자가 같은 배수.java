import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Solution{
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) {
			String num = br.readLine();
			int nnum = Integer.parseInt(num);
	
			int size = num.length();
			int ch = 0;
			
			String result = "";
			int mul = 2;
			while(true) {//K배까지 반복
				int check  = nnum * mul ;
				mul++;
				result = Integer.toString(check);
				ch = 0;
				if(result.length() > size) {
					System.out.println("#"+i+" "+"impossible");
					break;
				}
				for(int j=0;j<result.length();j++) {
					char c = result.charAt(j);
					if(num.contains(Character.toString(c))) {
						ch ++;
					}
				}
				if(size == ch) {
					System.out.println("#"+i+" "+"possible");
					break;
				}
				else {
					continue;
				}
			}
		}
	}
}