import java.util.*;
import java.io.*;

class Main {
    static int N;

    static int[] parent;
    static List<Integer>[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        tree = new List[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            tree[s].add(e);
            tree[e].add(s);
        }
        bfs(1);
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];

        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curNode = q.poll();

            for (int nextNode : tree[curNode]) {
                if (visited[nextNode]) continue;

                parent[nextNode] = curNode;
                visited[nextNode] = true;
                q.offer(nextNode);
            }
        }
        for (int i = 2; i < N + 1; i++) {
            System.out.println(parent[i]);
        }
    }
}