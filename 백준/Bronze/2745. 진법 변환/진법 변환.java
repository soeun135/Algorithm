import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	String N = st.nextToken();
    	int num =0;
    	int B = Integer.parseInt(st.nextToken());
    	int result = 0;
    	for(int i=0;i<N.length();i++) {
    		char c = N.charAt(i);
    		if(c >= 'A' && c<='Z') { //알파벳 대문자면
    			num = c-55;
    		}
    		else num = Character.getNumericValue(c);
    		result += num * (int)Math.pow(B,N.length()-1-i);
    	}
    	System.out.println(result);
 	}
}