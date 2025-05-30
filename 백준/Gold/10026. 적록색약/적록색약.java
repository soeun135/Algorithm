import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static boolean[][] visited;
    static boolean[][] visited2;
    static int[][] picture;
    static int[][] picture2;
    static int[] result;


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

        picture = new int[N][N];
        picture2 = new int[N][N];
        visited = new boolean[N][N];
        visited2 = new boolean[N][N];
        result = new int[2];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                char val = str.charAt(j);

                switch (val) {
                    case 'R':
                        picture[i][j] = 0;
                        picture2[i][j] = 0;
                        break;
                    case 'G':
                        picture[i][j] = 1;
                        picture2[i][j] = 0;
                        break;
                    case 'B':
                        picture[i][j] = 2;
                        picture2[i][j] = 1;
                        break;
                }
            }
        }
        int c = 0;
        while (c < 3) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && picture[i][j] == c) {
                        result[0] ++;
                        dfs(new Point(i, j), c, picture, visited);
                    }

                    if (c < 2  && !visited2[i][j] && picture2[i][j] == c) {
                        result[1] ++;
                        dfs(new Point(i, j), c, picture2, visited2);
                    }
                }
            }
            visited = new boolean[N][N];
            visited2 = new boolean[N][N];
            c++;
        }

        System.out.println(result[0] + " " + result[1]);
    }

    public static void dfs(Point cur, int chk, int[][] picture, boolean[][] visited) {
        visited[cur.x][cur.y] = true;

        for (int i = 0; i < 4; i++) {
            int dx = cur.x + d[i][0];
            int dy = cur.y + d[i][1];

            if (dx < 0 || dy < 0 || dx >= N || dy >= N || visited[dx][dy] || picture[dx][dy] != chk) {
                continue;
            }
            dfs(new Point(dx, dy), chk, picture, visited);
        }
    }
}
