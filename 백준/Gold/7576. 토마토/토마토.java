import java.util.*;
import java.io.*;

class Main {
    static int M, N;
    static int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[][] tomato;
    static boolean[][] visited;
    static int day = 0;
    static Queue<Point> q = new LinkedList<>();
    static class Point {
        int x;
        int y;
        int day;


        public Point(int x, int y, int day) {
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

        boolean done = true;

        tomato = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());

                if (done && tomato[i][j] == 0) {
                    done = false;
                }
                if (tomato[i][j] == 1) { //d익은 토마토 큐에 넣기
                    q.offer(new Point(i, j, 0));
                }
            }
        }
        if (done) {
            System.out.println(0);
            return;
        }

        bfs();


        if (checkDone()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    static boolean checkDone() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }



    static void bfs() {

        while (!q.isEmpty()) {
            Point cur = q.poll();

            boolean flag = true;

            for (int i = 0; i < 4; i++) {
                int dx = cur.x + d[i][0];
                int dy = cur.y + d[i][1];

                if (dx < 0 || dy < 0 || dx >= N || dy >= M || tomato[dx][dy] == -1) {
                    continue;
                }

                if (tomato[dx][dy] == 0) { //안 익은 거 큐에 추가
                    tomato[dx][dy] = 1;
                    flag = false;
                    q.offer(new Point(dx, dy, cur.day + 1));
                }
            }
            day = cur.day;
        }
    }
}