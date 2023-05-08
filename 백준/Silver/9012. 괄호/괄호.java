import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++) {
        	String str = br.readLine();
        	Stack <Character>stack = new Stack<>();
        	int ch =0;
        	for(int j=0;j<str.length();j++) {
        		if(str.charAt(j) == '(') 
            			stack.push(str.charAt(j));
        		else {// ')'였다면
        			if(stack.isEmpty()) {
        				sb.append("NO"+"\n");
        				ch = 1;
        				break;
        			}
        			else stack.pop();
        		}
        	}
        	if(!stack.isEmpty()) sb.append("NO"+"\n");
        	else if(stack.isEmpty()&& ch==0)sb.append("YES"+"\n");
        }
        System.out.println(sb);
    }
}

