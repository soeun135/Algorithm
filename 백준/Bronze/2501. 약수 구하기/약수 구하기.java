import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.String;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
             
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int count =0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=num1;i++) {
        	if(num1%i == 0) {
        		count ++;
        	}
        	if(count == num2) {
        		sb.append(i);
        		break;
        	}
        }
        if(count < num2) sb.append(0);
        System.out.println(sb);
    }
}

