import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     
        	int Aarr[] = new int[2];
        	int Barr[] = new int[2];
        	for(int i=0;i<2;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
            	Aarr[i] = Integer.parseInt(st.nextToken());
            	Barr[i] = Integer.parseInt(st.nextToken());
        	}
        	int b = GCF(Math.max(Barr[0],Barr[1]),Math.min(Barr[0],Barr[1]));
        	int LCF = Barr[0]*Barr[1] / b;

        	for(int i=0;i<2;i++) {
        		if(Barr[i] != LCF) {
        			int n = LCF / Barr[i];
        			Aarr[i] *= n;
        			Barr[i] *= n;
        		}
        	}
        	int a = Aarr[0]+Aarr[1];
        	int result = GCF(Math.max(a,Barr[0]),Math.min(a,Barr[0]));
        	System.out.println(a/result+" "+Barr[0]/result);
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

