import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine());
        Queue <Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int rear=-1 ;
        for(int i=0;i<K;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String str = st.nextToken();
        	int num;
        	
        	if(str.equals("push")) { //스택이 비어있든 아니든 상관 X
        		num = Integer.parseInt(st.nextToken());
        		q.offer(num);
        		rear = num;
        	}
        	else if(str.equals("pop")) {
        		if(!q.isEmpty())
        			sb.append(q.remove()+"\n");
        		else sb.append(-1+"\n");
        	}
        	else if(str.equals("size")) {
        		sb.append(q.size()+"\n");
        	}
        	else if(str.equals("empty")) {
        		if(!q.isEmpty())
        			sb.append(0+"\n");
        		else sb.append(1+"\n");
        	}
        	else if(str.equals("front")) {
        		if(!q.isEmpty())
        			sb.append(q.peek()+"\n");
        		else sb.append(-1+"\n");
        	}
        	else if(str.equals("back")) {
        		if(!q.isEmpty()) {
        			sb.append(rear+"\n");
        		}
        		else sb.append(-1+"\n");
        	}
        }
        System.out.println(sb);
    }
}

