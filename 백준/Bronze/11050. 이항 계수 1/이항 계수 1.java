import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int result =1;
		
		
		result = factorial(N)/(factorial(K)*factorial(N-K));

		System.out.println(result);
	}
	public static int factorial(int x) {
		int result = 1;
		
		for(int i=x;i>=1;i--) {
			result *= i;
		}
		return result;
	}
}