import java.util.*;
import java.io.*;

public class Main {
    static int T;
    static int l;
    static int[][] chess;
    static boolean[][] visited;
    static int[] dx = {-2, -1, -2, -1, 1, 2, 1, 2};
    static int[] dy = {-1, -2, 1, 2, -2, -1, 2, 1};
    static Queue<Point> q;
    static Point start, end;

    static class Point {
        int x, y, cnt;

        public Point(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            l = Integer.parseInt(br.readLine());
            q = new LinkedList<>();

            chess = new int[l][l];
            visited = new boolean[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            start = new Point(a, b, 0);

            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            end = new Point(c, d, 0);

            if (a == c && b == d) {
                System.out.println(0);
                continue;
            }
            bfs();
        }
    }

    public static void bfs() {
        q.offer(start);
        visited[start.x][start.y] = true;

        while (!q.isEmpty()) {
            Point cur = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx == end.x && ny == end.y) {
                    System.out.println(cur.cnt + 1);
                    return;
                }

                if (nx < 0 || ny < 0 || nx >= l || ny >= l || visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                q.offer(new Point(nx, ny, cur.cnt + 1));
            }
        }
    }
}
