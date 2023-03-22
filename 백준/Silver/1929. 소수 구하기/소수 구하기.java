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
		int m=0;
		int n = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n+1];
		for(int i=0;i<=n;i++) {
			arr[i] = 0;
		}
		arr[0] = 1; //0과 1은 소수가 아님
		arr[1] = 1;
		
		for(int i=2;i<=Math.sqrt(n);i++) { //2부터 범위 끝의 제곱근(4) 까지 반복 그 수들의 약수를 없애줘야하니까
			if(arr[i] == 1) continue;
			for(int j =i*i; j<=n; j+=i ) {
				arr[j] = 1; //소수가 아닌 수 1로 값 초기화
			}
		}
		for(int i=m;i<=n;i++) {
			if(arr[i] == 0)
				bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}