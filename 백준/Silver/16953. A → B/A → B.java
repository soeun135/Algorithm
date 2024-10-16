import java.io.*;
import java.util.*;

class Main {
    static Long s, g;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        s = Long.parseLong(st.nextToken());
        g = Long.parseLong(st.nextToken());

        bfs();
    }

    static void bfs() {
        Queue<Long> q = new LinkedList<>();
        int cnt = 0;

        q.offer(s);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                long cur = q.poll();

                if (cur == g) {
                    System.out.println(cnt + 1);
                    return;
                }
                if (cur * 2 <= g) q.offer(cur * 2);
                if (cur * 10 + 1 <= g) q.offer(cur * 10 + 1);
            }
            cnt ++;

        }
        System.out.println(-1);
    }
}