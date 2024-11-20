import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] selected;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        selected = new int[N];
        visited = new boolean[N];

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                selected[depth] = i + 1;
                visited[i] = true;

                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
