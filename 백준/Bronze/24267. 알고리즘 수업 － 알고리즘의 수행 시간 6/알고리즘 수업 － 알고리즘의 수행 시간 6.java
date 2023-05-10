import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long T = Long.parseLong(br.readLine());
        long count = 0;
       long sum = 0;
        for(long i=1;i<=T;i++) {
        	sum += (i-2)*(i-1)/2;
        }
        System.out.println(sum);
        System.out.println(3);
    }
}

