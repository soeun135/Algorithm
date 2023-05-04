import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	int dong = 0;
    	int i=1;
    	while(dong < T) {
    		dong += i;
    		i++;
    	}i--;
    	int ch = i - (dong - T); //i == 해당 덩어리에서 몇 번째에 있는지
    	if(i %2 == 0) {//짝수 덩어리
    		for(int j=1;j<=i;j++) {
    			if(ch == j) {
    				sb.append(j+"/"+(i+1-ch));
    				break;
    			}
    		}
    	}
    	else {//홀수 덩어리
    		for(int j=1;j<=i;j++) {
    			if(ch == j) {
    				sb.append((i+1-ch)+"/"+j);
    				break;
    			}
    		}
    	}
    	System.out.println(sb);
 	}
}