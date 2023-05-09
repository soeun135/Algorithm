import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long T = Long.parseLong(br.readLine());
        long count = 0;
        for(long i = T-1;i>0;i--) {
        	count += i;
        }
        System.out.println(count);
        System.out.println(2);
    }
}

