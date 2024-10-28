import java.util.*;
import java.io.*;

public class Main {

    static int N, M, R;
    static int u, v;
    static List[] graph;
    static boolean[] visited;
    static int[] order;
    static int start = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new List[N + 1];
        visited = new boolean[N + 1];
        order = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        order[R] = ++start;
        dfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(order[i]);
        }
    }


    public static void dfs(int cur) {
        visited[cur] = true;

        for (int i = 0; i < graph[cur].size(); i++) {
            if (!visited[(int) graph[cur].get(i)]) {
                order[(int) graph[cur].get(i)] = ++start;
                visited[(int) graph[cur].get(i)] = true;
                dfs((int) graph[cur].get(i));
            }
        }
    }
}
