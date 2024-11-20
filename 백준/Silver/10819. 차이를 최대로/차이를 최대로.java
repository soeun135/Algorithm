import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] selected;
    static int[] num;
    static boolean[] visited;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        num = new int[N];
        selected = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        visited = new boolean[N];
        dfs(0);

        System.out.println(result);
    }

    public static void dfs(int depth) {
        if (depth == N) {
            result = Math.max(result, calc());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                selected[depth] = num[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    public static int calc() {
        int sum = 0;
        for (int i = 1; i < N; i++) {
            sum += Math.abs(selected[i - 1] - selected[i]);
        }
        return sum;
    }
}
