import java.io.*;
import java.util.*;

class Main {
    static boolean[] visited;
    static List<Integer>[] tree;
    static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        tree = new ArrayList[N + 1];
        parents = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree[a].add(b);
            tree[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < N + 1; i++) {
            System.out.println(parents[i]);
        }
    }

    private static void dfs(int node) {
        if (visited[node]) return;

        visited[node] = true;

        for (int i : tree[node]) {
            if (visited[i]) continue;
            parents[i] = node;
            dfs(i);
        }
    }
}