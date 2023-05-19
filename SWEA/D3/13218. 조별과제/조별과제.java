import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++) {
        	int group = 0;
        	int N = Integer.parseInt(br.readLine());
        	
        
        	System.out.println("#"+i+" "+N/3);
        }
    }
}

