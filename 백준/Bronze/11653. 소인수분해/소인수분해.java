import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
       
        for(int i=2;i<=N;i++) {
        	 if(N == 1) break;
        	while( N % i == 0) {
        		N /= i;
        		System.out.println(i);
        	}
        }
        
    }
}

