import java.util.*;
import java.io.*;

public class Main {
    static int M, N, K;
    static int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static boolean[][] visited;
    static int[][] paper;
    static int cnt;
    static int tmpWidth;
    static List<Integer> width = new ArrayList<>();

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        paper = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            drawSqare(x1, y1, x2, y2);

        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && paper[i][j] == 0) {
                    tmpWidth = 1;
                    visited[i][j] = true;
                    width.add(dfs(new Point(i, j)));
                    cnt++;

                }
            }
        }
        System.out.println(cnt);

        Collections.sort(width);
        for (int i : width) {
            System.out.print(i + " ");
        }
    }

    public static int dfs(Point cur) {

        for (int i = 0; i < 4; i++) {
            int dx = cur.x + d[i][0];
            int dy = cur.y + d[i][1];

            if (dx < 0 || dy < 0 || dx >= N || dy >= M || visited[dx][dy] || paper[dx][dy] == 1) {
                continue;
            }

            visited[dx][dy] = true;
            tmpWidth++;
            dfs(new Point(dx, dy));
        }
        return tmpWidth;
    }

    public static void drawSqare(int x1, int y1, int x2, int y2) {

        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                if (paper[i][j] == 0) {
                    paper[i][j] = 1;
                }
            }
        }
    }
}
