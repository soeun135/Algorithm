import java.util.*;
import java.io.*;

class Main {
    static int N;
    static boolean[][] visited;
    static int[][] map;
    static int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    static List<Integer> houseCnt;

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];
        houseCnt = new ArrayList();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    houseCnt.add(bfs(i, j));
                }
            }
        }
        Collections.sort(houseCnt);
        System.out.println(houseCnt.size());

        for (int i : houseCnt) {
            System.out.println(i);
        }
    }

    static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        visited[x][y] = true;
        int cnt = 1;
        while(!q.isEmpty()) {
            Point cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int dx = cur.x + d[i][0];
                int dy = cur.y + d[i][1];

                if (dx < 0 || dy < 0 || dx >= N || dy >= N || visited[dx][dy] || map[dx][dy] == 0) {
                    continue;
                }
                //1이면
                q.offer(new Point(dx, dy));
                visited[dx][dy] = true;
                cnt ++;
            }
        }
        return cnt;
    }
}