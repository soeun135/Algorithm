import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	int result = 0;
    	List <Integer>list = new ArrayList<>();
    	while(N >= B) {
    		list.add(0,N%B);
    		N /= B;
    	}list.add(0,N);
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<list.size();i++) {
    		if(list.get(i) >= 10 && list.get(i) <= 35) {
    			char c = (char)(list.get(i)+55);
    			sb.append(c);
    		}
    		else sb.append(list.get(i));
    	}
    	System.out.println(sb);
 	}
}