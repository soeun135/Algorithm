import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i=1;i<=T;i++) {
    		StringBuilder sb = new StringBuilder();
    		String str1= br.readLine();
    		String str2 = br.readLine();

    		if((str1+"a").equals(str2)) {
    			sb.append("N");
    		}
    		else sb.append("Y");
    		System.out.println("#"+i+" "+sb);
    	}
    }
}

