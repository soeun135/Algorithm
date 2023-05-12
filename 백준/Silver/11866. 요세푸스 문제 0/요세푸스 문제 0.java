import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue <Integer>q  = new LinkedList<>();
		List <Integer>result = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			q.add(i+1);
		}
		while(result.size() != N) {
			for(int i=0;i<K-1;i++) {
				q.offer(q.poll());
			}
			result.add(q.poll());
		}
		
		System.out.print("<");
		for(int i=0;i<N;i++) {
			if(i != N-1) {
			System.out.print(result.get(i)+","+" ");
			}
			else System.out.print(result.get(i)+">");
		}
	}
}