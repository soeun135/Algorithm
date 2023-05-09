import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long T = Long.parseLong(br.readLine());
        
        System.out.println((long)Math.pow(T, 2));
        System.out.println(2);
    }
}

