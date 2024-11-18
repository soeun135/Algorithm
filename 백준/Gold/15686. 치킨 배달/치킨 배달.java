import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[][] city;
    static List<Point> home = new ArrayList<>();
    static List<Point> chicken = new ArrayList<>();
    static int[] selected;
    static int result = Integer.MAX_VALUE;

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

        city = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                city[i][j] = Integer.parseInt(st.nextToken());

                if (city[i][j] == 1) {
                    home.add(new Point(i, j));
                } else if (city[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }
        selected = new int[M];
        dfs(0, 0);

        System.out.println(result);
    }


    public static void dfs(int start, int depth) {

        if (depth == M) {
            chickenDistCalc();
            return;
        }

        for (int i = start; i < chicken.size(); i++) {
            selected[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }

    public static void chickenDistCalc() {
        int totalDist = 0;

        for (Point curHome : home) {
            int minDist = Integer.MAX_VALUE;

            for (int i = 0; i < M; i++) {
                Point curChick = chicken.get(selected[i]);
                int dist = Math.abs(curHome.x - curChick.x) + Math.abs(curHome.y - curChick.y);
                minDist = Math.min(minDist, dist);
            }
            totalDist += minDist;
        }
        result = Math.min(result, totalDist);
    }
}
