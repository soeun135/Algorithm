import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[2_000_001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(br.readLine());
        
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (x - num > 0 && arr[x - num] == 1) {
                answer++;
            }
            arr[num] = 1;
        }
        System.out.println(answer);
        br.close();
    }
}