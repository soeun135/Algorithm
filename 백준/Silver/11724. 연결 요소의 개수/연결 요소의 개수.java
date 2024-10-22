import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static List[] line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        line = new List[N + 1];

        for (int i = 0; i < N + 1; i++) {
            line[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            line[u].add(v);
            line[v].add(u);
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i + 1]) {
                bfs(i + 1);
                cnt++;
            }
        }

        System.out.println(cnt);

    }
    static int cnt = 0;

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 0; i < line[cur].size(); i++) {
                if (!visited[(int) line[cur].get(i)]) {
                    visited[(int) line[cur].get(i)] = true;
                    q.offer((int) line[cur].get(i));
                }
            }
        }
    }
}
