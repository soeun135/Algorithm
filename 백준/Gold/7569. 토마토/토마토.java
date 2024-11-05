import java.util.*;
import java.io.*;

public class Main {
    static int M, N, H;
    static int[][][] tomato;
    static boolean[][][] visited;
    static int day = 0;

    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {-1, 1, 0, 0, 0, 0};
    static int[] dh = {0, 0, 0, 0, -1, 1};

    static class Point {
        int x, y, h;

        public Point(int h, int x, int y) {
            this.x = x;
            this.y = y;
            this.h = h;
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

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        if (done()) {
            System.out.println(day);
            return;
        }
        bfs();

        if (done()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    public static void bfs() {
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (tomato[i][j][k] == 1) {
                        q.offer(new Point(i, j, k));
                        visited[i][j][k] = true;
                    }
                }
            }
        }
        while (!q.isEmpty()) {

            int size = q.size();
            boolean flag = false;

            for (int i = 0; i < size; i++) {
                Point cur = q.poll();

                for (int j = 0; j < 6; j++) {
                    int nh = cur.h + dh[j];
                    int nx = cur.x + dx[j];
                    int ny = cur.y + dy[j];

                    if (nh < 0 || nx < 0 || ny < 0 || nh >= H || nx >= N || ny >= M || visited[nh][nx][ny] || tomato[nh][nx][ny] == -1) {
                        continue;
                    }

                    if (tomato[nh][nx][ny] == 0) {
                        tomato[nh][nx][ny] = 1;
                        visited[nh][nx][ny] = true;
                        q.offer(new Point(nh, nx, ny));
                        flag = true;
                    }
                }
            }
            if (flag) day++;
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
