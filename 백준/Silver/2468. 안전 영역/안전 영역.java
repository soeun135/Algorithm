import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static boolean[][] visited;
    static int[][] length;
    static int maxLength = 0;
    static int safeCnt = 0;
    static int rain = 0;
    static int tmpCnt;

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        length = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                length[i][j] = Integer.parseInt(st.nextToken());

                maxLength = Math.max(maxLength, length[i][j]);
            }
        }

        while (rain != maxLength) {
            visited = new boolean[N][N];
            tmpCnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && length[i][j] > rain) {
                        dfs(new Point(i, j), rain);
                        tmpCnt++;
                    }
                }
            }
            safeCnt = Math.max(safeCnt, tmpCnt);
            rain++;
        }

        System.out.println(safeCnt);
    }

    public static void dfs(Point cur, int rain) {

        for (int i = 0; i < 4; i++) {
            int dx = cur.x + d[i][0];
            int dy = cur.y + d[i][1];

            if (dx < 0 || dy < 0 || dx >= N || dy >= N || visited[dx][dy] || length[dx][dy] <= rain) {
                continue;
            }

            visited[dx][dy] = true;
            dfs(new Point(dx, dy), rain);
        }
    }
}
