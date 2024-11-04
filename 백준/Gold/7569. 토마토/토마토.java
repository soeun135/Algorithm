import java.util.*;
import java.io.*;

public class Main {
    static int[][][] tomato;
    static boolean[][][] visited;
    static int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {0, 0}, {0, 0}};
    static int[] dH = {0, 0, 0, 0, -1, 1};
    static int N, M, H;
    static int day = 0;

    static Queue<Point> q = new LinkedList<>();


    public static class Point {
        int h, x, y, day;

        public Point(int h, int x, int y, int day) {
            this.h = h;
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        tomato = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int x = 0; x < N; x++) {
                st = new StringTokenizer(br.readLine());

                for (int y = 0; y < M; y++) {
                    tomato[h][x][y] = Integer.parseInt(st.nextToken());

                    if (tomato[h][x][y] == 1) {
                        q.offer(new Point(h, x, y, 0));
                        visited[h][x][y] = true;
                    }
                }
            }
        }
        if (done()) {
            System.out.println(day);
            return;
        }

        bfs();

        if (!done()) {
            System.out.println(-1);
            return;
        }
        System.out.println(day);
    }

    public static void bfs() {

        while (!q.isEmpty()) {
            Point cur = q.poll();

            for (int i = 0; i < 6; i++) {
                int dh = cur.h + dH[i];
                int dx = cur.x + d[i][0];
                int dy = cur.y + d[i][1];

                if (dx < 0 || dy < 0 || dh < 0 || dh >= H || dx >= N || dy >= M || visited[dh][dx][dy] || tomato[dh][dx][dy] == -1) {
                    continue;
                }

                if (tomato[dh][dx][dy] == 0) {
                    tomato[dh][dx][dy] = 1;
                    q.offer(new Point(dh, dx, dy, cur.day + 1));
                    visited[dh][dx][dy] = true;
                }
            }
            day = cur.day;
        }
    }

    public static boolean done() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomato[i][j][k] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
