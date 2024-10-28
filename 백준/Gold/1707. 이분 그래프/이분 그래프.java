import java.util.*;
import java.io.*;

public class Main {
    static int k;
    static int V, E;
    static int u, v;

    static List[] graph;
    static int[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            graph = new List[V + 1];
            visit = new int[V + 1];

            for (int j = 0; j <= V; j++) {
                graph[j] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());

                u = Integer.parseInt(st.nextToken());
                v = Integer.parseInt(st.nextToken());

                graph[u].add(v);
                graph[v].add(u);
            }

//            visit[1] = 1;
//            dfs(1);

            bfs();
//            if (chk) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
        }
    }

    static boolean flag = false;
    static boolean chk = true;

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= V; i++) {
            if (visit[i] == 0) {
                q.offer(i);
                visit[i] = 1;
            }

            while (!q.isEmpty()) {
                int now = q.poll();

                for (int j = 0; j < graph[now].size(); j++) {

                    if (visit[(int) graph[now].get(j)] == 0) {
                        q.offer((int) graph[now].get(j));
                    }
                    if (visit[now] == visit[(int) graph[now].get(j)]) {
                        System.out.println("NO");
                        return;
                    }

                    if (visit[(int) graph[now].get(j)] == 0) {
                        if (visit[now] == 1) {
                            visit[(int) graph[now].get(j)] = 2;
                        } else {
                            visit[(int) graph[now].get(j)] = 1;
                        }
                    }
                }
            }
        }
        System.out.println("YES");
    }

    public static void dfs(int start) {

        for (int i = 0; i < graph[start].size(); i++) {
            //방문했으면 빠르게
            if (visit[(int) graph[start].get(i)] != 0) {
                if (visit[start] == visit[(int) graph[start].get(i)]) {
                    chk = false;
                    return;
                }
            }
            if (flag) {
                visit[(int) graph[start].get(i)] = 1;
            } else {
                visit[(int) graph[start].get(i)] = 2;
            }
            flag = !flag;
            dfs((int) graph[start].get(i));
        }

    }

}

