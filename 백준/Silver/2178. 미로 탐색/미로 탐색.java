import java.util.*;
import java.io.*;

class Main {
    static int[][] maze;
    static int[][] move;
    static boolean[][] visited;
    static int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    static int N, M;

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        move = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        bfs();
    }

    public static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, 0));
        move[0][0] = 1;

        while (!q.isEmpty()) {
            Point cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int dx = cur.x + d[i][0];
                int dy = cur.y + d[i][1];

                if (dx == N - 1 && dy == M - 1) {
                    System.out.println(move[cur.x][cur.y] + 1);
                    return;
                }
                if (dx < 0 || dy < 0 || dx >= N || dy >= M || visited[dx][dy] || maze[dx][dy] == 0) {
                    continue;
                }

                q.offer(new Point(dx, dy));
                move[dx][dy] = move[cur.x][cur.y] + 1;
                visited[dx][dy] = true;
            }
        }
    }
}