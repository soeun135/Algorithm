import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] lab;
    static int[][] tmpLab;
    static int[][] d = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    static int max = Integer.MIN_VALUE;

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
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        lab = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(st.nextToken());

            }
        }

        // 벽 3개를 세우는 모든 경우 탐색 - dfs
        buildWalls(0);


        System.out.println(max);
    }

    public static void buildWalls(int num) {
        if (num == 3) {
            virus();
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (lab[i][j] == 0) {
                    lab[i][j] = 1;
                    buildWalls(num + 1);
                    lab[i][j] = 0;
                }
            }
        }
    }

    //바이러스 퍼트리는 bfs 함수
    public static void virus() {
        Queue<Point> q = new LinkedList<>();
        tmpLab = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tmpLab[i][j] = lab[i][j];
                if (lab[i][j] == 2)
                    q.offer(new Point(i, j));
            }
        }
        while (!q.isEmpty()) {
            Point cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int dx = cur.x + d[i][0];
                int dy = cur.y + d[i][1];

                if (dx < 0 || dy < 0 || dx >= N || dy >= M || tmpLab[dx][dy] == 1) {
                    continue;
                }

                if (tmpLab[dx][dy] == 0) {
                    tmpLab[dx][dy] = 2;
                    q.offer(new Point(dx, dy));
                }
            }
        }
        calculate();
    }

    public static void calculate() {
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tmpLab[i][j] == 0) {
                    tmp++;
                }
            }
        }
        max = Math.max(max, tmp);
    }
}
