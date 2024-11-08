import java.awt.print.Pageable;
import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[][] graph;
    static boolean[] visited;
    static int result = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new int[N][N];
        visited = new boolean[N ];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);

        System.out.println(result);
    }

    public static void dfs(int playerIdx, int selectNum) {
        if (selectNum == N / 2) {
            calPower();
            return;
        }

        for (int i = playerIdx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, selectNum + 1);
                visited[i] = false;
            }
        }
    }

    public static void calPower() {
        int teamStart = 0;
        int teamLink = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i] && !visited[j]) {
                    teamStart += graph[i][j];
                } else if (visited[i] && visited[j]) {
                    teamLink += graph[i][j];
                }
            }
        }
        int diff = Math.abs(teamStart - teamLink);
        result = Math.min(diff, result);
    }
}
