import java.io.*;
import java.util.*;

class Main {
    static int N, K;
    static int d[] = {1, -1, 2};
    static boolean[] visited;
    static class Point{
        int x;
        int time;

        public Point(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
            return;
        }

        visited = new boolean[100001];

        bfs();
    }
    static void bfs() {

        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(N, 0));
        visited[N] = true;

        while (!q.isEmpty()) {
            Point cur = q.poll();

            for (int i = 0; i < 3; i++) {
                int dx = 0;
                if (i != 2) {
                    dx = cur.x + d[i];
                } else {
                    dx = cur.x * d[i];
                }

                if (dx == K) {
                    System.out.println(cur.time + 1);
                    return;
                }
                if (dx < 0 || dx >= 100001 || visited[dx]) {
                    continue;
                }
                visited[dx] = true;
                q.offer(new Point(dx, cur.time + 1));

            }
        }
    }
}