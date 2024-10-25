import java.io.*;
import java.util.*;

public class Main {
    static int w, h;
    static int[][] map;
    static boolean[][] visited;

    static int d[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    static int island = 0;

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String cur = "";
        while (true) {
            cur = br.readLine();

            if (cur.equals("0 0")) return;
            island = 0;
            StringTokenizer st = new StringTokenizer(cur);

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            map = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        dfs(new Point(i,j));
                        island++;
                    }
                }
            }
            System.out.println(island);
        }
    }
    public static void dfs(Point cur){

        for (int i = 0; i < 8; i++) {
            int dx = cur.x + d[i][0];
            int dy = cur.y + d[i][1];

            if (dx < 0 || dy < 0 || dx >= h || dy >= w || visited[dx][dy] || map[dx][dy] == 0) {
                continue;
            }

            visited[dx][dy] = true;
            dfs(new Point(dx, dy));
        }
    }
}
