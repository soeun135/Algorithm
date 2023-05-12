import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


class Solution{
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		Stack <Character>stack = new Stack<>();
		for(int i=1;i<=T;i++) {
			String str = br.readLine();
			int count =0;
			char now = ' ';
			for(int j=0;j<str.length();j++) {
				char c = str.charAt(j);
				stack.push(c);
			}
			while(!stack.isEmpty()) {
				char c = stack.pop();
				if(c == ')') {
					if(stack.peek() == '(') {
						count++;
						stack.pop();
					}
					else count++;
				}
				else if(c=='(') {
					count++;
				}
				else continue;
			}
			System.out.println("#"+i+" "+count);
		}
	}
}