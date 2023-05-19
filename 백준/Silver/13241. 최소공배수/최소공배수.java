import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     
       
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long A = Long.parseLong(st.nextToken());
        	long B = Long.parseLong(st.nextToken());
        	
        	long GCF = GCF(Math.max(A, B),Math.min(A, B));
        	long LCF = A*B / GCF;
        	System.out.println(LCF);
    }
    public static long GCF(long A,long B) {
    	long r = A%B;
    	if(r == 0) {
    		return B;
    	}
    	else
    		return GCF(B,r);
    }
}

