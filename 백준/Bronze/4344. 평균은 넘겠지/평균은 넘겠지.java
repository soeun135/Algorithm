import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken());
		
			int score[] = new int[count];
			int sum = 0;
			for(int j = 0;j<count;j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			double avg = sum/count;
			
			double high = 0;
			for(int j=0;j<count;j++) {
				if(score[j] > avg) {
					high ++;
				}
			}
			sb.append(String.format("%.3f",high/count*100)+"%\n");
		}
		System.out.println(sb);
	}
}