import java.util.*;
import java.io.*;

class Main {
    static class Node {
        int E;
        int V;

        public Node(int E, int V) {
            this.E = E;
            this.V = V;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        List<Node>[] graph = new ArrayList[V + 1];
        boolean[] visited = new boolean[V + 1];
        int[] D = new int[V + 1];

        Arrays.fill(D, Integer.MAX_VALUE);
        D[K] = 0;
        for (int i = 1; i < V + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u].add(new Node(v, w));
        }
        PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) -> o1.V - o2.V);
        q.offer(new Node(K, 0));

        while (!q.isEmpty()) {
            Node curNode = q.poll();

            if (visited[curNode.E]) continue;
            visited[curNode.E] = true;

            for (Node node : graph[curNode.E]) {
                if (D[node.E] > D[curNode.E] + node.V) {
                    D[node.E] = D[curNode.E] + node.V;
                    q.offer(new Node(node.E, D[node.E]));
                }
            }
        }

        for (int i = 1; i < D.length; i++) {
            if (D[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else
                System.out.println(D[i]);
        }
    }
}