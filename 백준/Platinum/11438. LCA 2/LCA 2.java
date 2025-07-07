import java.util.*;
import java.io.*;

class Main {
    static List<Integer>[] tree;
    static boolean[] visited;
    static int k = 0;
    static int maxDepth;
    static int[] depth;
    static int[] p;
    static int[][] parent;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        tree = new List[N + 1];
        visited = new boolean[N + 1];
        p = new int[N + 1];
        depth = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree[a].add(b);
            tree[b].add(a);
        }
        bfs (1);

        while (!(Math.pow(2, k + 1) > maxDepth)) k++;

        parent = new int[k + 1][N + 1];
        parent[0] = p;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= N; j++) {

                parent[i][j] = parent[i - 1][parent[i - 1][j]];
//                parent[i][j] = (parent[i][j] != 0 ? parent[i][j] : recursive(i, j));
            }
        }
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            LCA(a, b);
        }
    }
    private static void LCA(int a, int b) {
        if (depth[a] < depth[b]) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (depth[a] != depth[b]) {
            int depthDiff = Math.abs(depth[a] - depth[b]);
            int kk = 0;
            while (!(Math.pow(2, kk + 1) > depthDiff)) {
                kk++;
            }
            a = parent[kk][a];
        }
        for (int i = k; i >= 0; i--) {
            if (parent[i][a] != parent[i][b]) {
                a = parent[i][a];
                b = parent[i][b];
            }
        }
        if (a == b) System.out.println(a);
        else System.out.println(p[a]);
    }

    private static int recursive(int kk, int n) {
        if (kk == 0 || parent[kk][n] != 0) return parent[kk][n];

        return recursive(kk - 1, recursive(kk - 1, n));
    }
    private static void bfs(int root) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(root);
        visited[root] = true;

        int level = 1;
        int count = 0;
        int nowSize = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next : tree[cur]) {
                if (!visited[next]) {
                    p[next] = cur;
                    q.offer(next);
                    visited[next] = true;
                    depth[next] = level;
                }
            }count++;

            if (count == nowSize) {
                level++;
                count = 0;
                nowSize = q.size();
            }
        } maxDepth = level;
    }
}