import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
	
		
		while( num-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken()); //문서의 갯수
			int index = Integer.parseInt(st.nextToken()); //몇 번째로 인쇄되었는지 궁금한 문서가 큐에서 몇 번째에 있는지 나타내는 정수
	
			LinkedList <int[]> q = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<count;i++) { //문서의 갯수만큼 큐에 인덱스와 중요도를 배열로 함께 넣음
				q.offer(new int[]{i,Integer.parseInt(st.nextToken())});
			}
			
			int check = 0;
			while(!q.isEmpty()) { //한 케이스에 대한 반복문
				int []first = q.poll(); //제일 앞에있는 값을 뽑아서 first 배열에 인덱스, 중요도 순으로 넣음.
				boolean isMax = true;
				for(int i=0;i<q.size();i++) {
					if(first[1] < q.get(i)[1]) {
						
						q.offer(first);
						for(int j=0;j<i ;j++) {
							q.offer(q.poll());
						}
						isMax = false; // 가장 처음 뽑은 front원소가 가장 큰 중요도를 가지지 않았음.
						break;
					}
				} 
				if( isMax == false) {
					continue;
				}
				check++;
				if(first[0] ==index) 
					break;
			}
			sb.append(check).append("\n");
			}
		System.out.println(sb);	
	}	
}