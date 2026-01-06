import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        while (num != -1) {
            if (num == 0) {
                q.poll();
                cnt--;
            } else if (cnt < N) {
                q.offer(num);
            }
            num = Integer.parseInt(br.readLine());
        }
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}