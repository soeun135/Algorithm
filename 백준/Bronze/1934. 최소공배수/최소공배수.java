import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	
        	int GCF = GCF(Math.max(A, B),Math.min(A, B));
        	int LCF = A*B / GCF;
        	System.out.println(LCF);
        }
    }
    public static int GCF(int A,int B) {
    	int r = A%B;
    	if(r == 0) {
    		return B;
    	}
    	else
    		return GCF(B,r);
    }
}

