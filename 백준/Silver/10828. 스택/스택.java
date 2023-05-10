import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine());
        Stack <Integer>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<K;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String str = st.nextToken();
        	int num;
        	if(str.equals("push")) { //스택이 비어있든 아니든 상관 X
        		num = Integer.parseInt(st.nextToken());
        		stack.push(num);
        	}
        	else if(str.equals("size")) {
        		sb.append(stack.size()+"\n");
        	}
        
        	else if(str.equals("top")) {
        		if(!stack.isEmpty())
        			sb.append(stack.peek()+"\n");
        		else sb.append(-1+"\n");
        	}
        	
        	else if(str.equals("pop")) {
        		if(!stack.isEmpty())
        			sb.append(stack.pop()+"\n");
        		else sb.append(-1+"\n");
        	}
        	else if(str.equals("empty")) {
        		if(!stack.isEmpty())
        			sb.append(0+"\n");
        		else sb.append(1+"\n");
        	}
        }
        System.out.println(sb);
    }
}

