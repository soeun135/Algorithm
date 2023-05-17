import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque <Integer>deque = new ArrayDeque<>();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num = 0;
			if(str.equals("push_front")) {
				num = Integer.parseInt(st.nextToken());
				deque.offerFirst(num);
			}
			else if(str.equals("push_back")) {
				num = Integer.parseInt(st.nextToken());
				deque.offer(num);
			}
			else if(str.equals("pop_front")) {
				if(!deque.isEmpty())
					System.out.println(deque.pollFirst());
				else System.out.println(-1);
			}
			else if(str.equals("pop_back")) {
				if(!deque.isEmpty())
					System.out.println(deque.pollLast());
				else System.out.println(-1);
			}
			else if(str.equals("size")) {
					System.out.println(deque.size());
			}
			else if(str.equals("empty")) {
				if(!deque.isEmpty())
					System.out.println(0);
				else System.out.println(1);
			}
			else if(str.equals("front")) {
				if(!deque.isEmpty())
					System.out.println(deque.getFirst());
				else System.out.println(-1);
			}
			else if(str.equals("back")) {
				if(!deque.isEmpty())
					System.out.println(deque.getLast());
				else System.out.println(-1);
			}
		}
	}
}