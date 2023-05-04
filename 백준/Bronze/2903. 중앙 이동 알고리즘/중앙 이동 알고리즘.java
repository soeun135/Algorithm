import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	int num = (int)Math.pow(2,T);
    	
    	System.out.println((num+1)*(num+1));
 	}
}