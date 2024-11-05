import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] lab;
    static int[][] tmpLab;
    static boolean[][] visited;
    static int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int result = Integer.MIN_VALUE;

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        lab = new int[N][M];
        tmpLab = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(result);
    }

    public static void dfs(int num) {
        if (num == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (lab[i][j] == 0) {
                    lab[i][j] = 1;
                    dfs(num + 1);
                    lab[i][j] = 0;
                }
            }
        }
    }

    public static void bfs() {
        Queue<Point> q = new LinkedList<>();
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tmpLab[i][j] = lab[i][j];

                if (tmpLab[i][j] == 2) {
                    q.offer(new Point(i, j));
                    visited[i][j] = true;
                }
            }
        }

        while(!q.isEmpty()) {
            Point cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int dx = cur.x + d[i][0];
                int dy = cur.y + d[i][1];

                if (dx < 0 || dy < 0 || dx >= N || dy >= M || visited[dx][dy] || tmpLab[dx][dy] == 1) {
                    continue;
                }

                if (tmpLab[dx][dy] == 0) {
                    tmpLab[dx][dy] = 2;
                    q.offer(new Point(dx, dy));
                }
                visited[dx][dy] = true;
            }
        }
        safeZone();
    }

    public static void safeZone() {
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tmpLab[i][j] == 0) {
                    tmp++;
                }
            }
        }
        result = Math.max(result, tmp);
    }
}
