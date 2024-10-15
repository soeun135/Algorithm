import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] paper = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int cnt = 0;
        int max = 0;

        // 1. 저장
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. 1이 있는 부분 찾아서 bfs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (paper[i][j] == 1 && !visited[i][j]) {
                    int width = bfs(paper, visited, i, j, n, m);
                    cnt++;

                    if (max < width) {
                        max = width;
                    }
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    static int bfs (int[][] paper, boolean[][] visited, int x, int y, int n, int m) {
        int width = 1;

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point cur = q.remove();

            for (int i = 0; i < 4; i++) {
                int dx = cur.x + d[i][0];
                int dy = cur.y + d[i][1];

                if (dx >= n || dx < 0 || dy >= m || dy < 0 || visited[dx][dy]) {
                    continue;
                }

                if (paper[dx][dy] == 1) {
                    visited[dx][dy] = true;
                    q.add(new Point(dx, dy));
                    width++;
                }
            }
        }
        return width;
    }
}