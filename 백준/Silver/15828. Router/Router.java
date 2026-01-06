import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        
        while (num != -1) {
            if (num == 0) {
                q.poll();
            } else if (q.size() < N) {
                q.offer(num);
            }
            num = Integer.parseInt(br.readLine());
        }
        if (q.isEmpty()) {
            System.out.println("empty");
        } else {
            while (!q.isEmpty()) {
                System.out.print(q.poll() + " ");
            }
        }
    }
}