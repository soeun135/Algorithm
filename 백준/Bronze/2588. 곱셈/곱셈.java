import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		String A = br.readLine();
		String B = br.readLine();
		int sum = 0;
		int j=1;
		for(int i=B.length()-1;i>=0;i--) {
			int num = Integer.parseInt(A)*Character.getNumericValue(B.charAt(i));
			System.out.println(num);
			sum+= num*j;
			j*=10;
		}
		System.out.println(sum);
	}
}