import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V;
    static List[] graph;
    static List<Integer> bfsResult = new ArrayList<>();
    static List<Integer> dfsResult = new ArrayList<>();
    static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new List[N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
            Collections.sort(graph[a]);
            Collections.sort(graph[b]);
        }

        dfs(V);
        visited = new boolean[N + 1];
        bfs();

        for (int i : dfsResult)
            System.out.print(i + " ");

        System.out.println();
        for (int i : bfsResult)
            System.out.print(i + " ");
    }

    public static void dfs(int cur) {
        dfsResult.add(cur);
        visited[cur] = true;

        for (int i = 0; i < graph[cur].size(); i++) {
            if (!visited[(int) graph[cur].get(i)]) {
                visited[(int) graph[cur].get(i)] = true;
                dfs((int) graph[cur].get(i));
            }
        }
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(V);
        visited[V] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            bfsResult.add(cur);

            for (int i = 0; i < graph[cur].size(); i++) {
                if (!visited[(int) graph[cur].get(i)]) {
                    visited[(int) graph[cur].get(i)] = true;
                    q.offer((Integer) graph[cur].get(i));
                }
            }

        }
    }
}