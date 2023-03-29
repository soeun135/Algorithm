import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int min = 0;
		int maxv = 0;
		int minv = 0;
		if(num1>num2) {
			min = num2;
		}
		else {
			min = num1;
		}
		for(int i=min;i>=1;i--) {
			if(num1%i == 0 && num2%i ==0) {
				maxv = i;
				minv = i*(num1/i) * (num2/i);
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(maxv+"\n"+minv);
		System.out.println(sb);
    }
}