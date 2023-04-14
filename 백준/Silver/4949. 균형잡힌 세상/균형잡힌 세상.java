import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack <Character>stack = new Stack<>();
		
		while(true) {
			stack.clear();
			int ch = 0;
			String str = br.readLine();
			
			if(str.charAt(0)=='.' && str.length()==1) break;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='(' || str.charAt(i)=='[') {
					stack.push(str.charAt(i));
				}
				else if(str.charAt(i)==')' || str.charAt(i)==']') {
					if(!stack.isEmpty()) {
						if(str.charAt(i)==')') {
							if(stack.peek() =='(') {
								stack.pop();
							}
							else {
								ch = 1;
								break;
							}
						}
						else if(str.charAt(i)==']') {
							if(stack.peek() =='[') {
								stack.pop();
							}
							else {
								ch = 1;
								break;
							}
						}
					}
					else {
						ch=1;
						break;
					}
				}
				
			}if(ch==0 && stack.isEmpty()) {
				sb.append("yes"+"\n");
			}
			else sb.append("no"+"\n");
		}
		System.out.print(sb);
	}
}