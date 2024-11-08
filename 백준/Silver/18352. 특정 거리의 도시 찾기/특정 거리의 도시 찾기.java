import java.util.*;
import java.io.*;

public class Main {
    static int N, M, K, X;
    static List[] graph;
    static boolean[] visited;
    static List<Integer> result = new ArrayList<>();


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        graph = new List[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
        }
        bfs();

        if (result.size() == 0) {
            System.out.println(-1);
            return;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(X);
        visited[X] = true;
        int dist = 0;
        while (!q.isEmpty()) {
            int size = q.size();

            if (dist == K) {
                result = new ArrayList<>(q);
                Collections.sort(result);
                return;
            }
            for (int i = 0; i < size; i++) {
                int cur = q.poll();


                for (int j = 0; j < graph[cur].size(); j++) {
                    int v = (int) graph[cur].get(j);
                    if (!visited[v]) {
                        visited[v] = true;
                        q.offer(v);
                    }
                }
            }
            dist ++;
        }
    }
}
