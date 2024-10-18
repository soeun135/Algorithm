import java.util.*;
import java.io.*;

class Main {
    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visited;
    static int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int cnt;

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            cabbage = new int[M][N];
            visited = new boolean[M][N];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                cabbage[x][y] = 1;
            }
            for (int l = 0; l < M; l++) {
                for (int j = 0; j < N; j++) {
                    if (cabbage[l][j] == 1 && !visited[l][j]) {
                        bfs(l, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }

    public static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point cur = q.poll();

            for (int k = 0; k < 4; k++) {
                int dx = cur.x + d[k][0];
                int dy = cur.y + d[k][1];

                if (dx < 0 || dy < 0 || dx >= M || dy >= N || visited[dx][dy] || cabbage[dx][dy] == 0) {
                    continue;
                }

                q.offer(new Point(dx, dy));
                visited[dx][dy] = true;
            }
        }
    }
}