import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		LinkedList <Integer> q = new LinkedList<>();
		
		for(int i =1;i<=N;i++) { //저장되는 카드번호는 1부터 N까지
			q.add(i);
		}
		while(q.size() != 1) {
			q.poll(); //제일 위에 요소 없애고
			q.offer(q.poll()); //그다음 젤 위에있는거 없애고 바로 반환 받아서 젤 뒤로 추가
		}
		System.out.println(q.peek());
	}	
}