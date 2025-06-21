import java.util.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] check;
    static boolean flag = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine()); //테스트 케이스 갯수

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            graph = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];

            for (int j = 1; j < V + 1; j++) {
                graph[j] = new ArrayList<>();
            }
            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());

                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                graph[u].add(v);
                graph[v].add(u);
            }
            // 모든 노드에 대해 dfs 실행
            for (int j = 1; j < V + 1; j++) {
                if (!visited[j]) {
                    check[j] = 1;
                    dfs(j);
                }
                if (!flag) {
                    break;
                }
                //dfs 결과가 이분 그래프 아니면 반복 종료
            }
            //이분그래프 결과 출력
            if (flag) System.out.println("YES");
            else System.out.println("NO");
            flag = true;
        }
    }

    private static void dfs(int cur) {
        //현재노드 출력?
        visited[cur] = true;

        for (int i = 0; i < graph[cur].size(); i++) {
            int next = (int) graph[cur].get(i);
            if (!visited[next]) {
                check[next] = check[cur] == 1 ? 2 : 1;
                dfs(next);
            } else { //방문했을 때
                if (check[cur] == check[next]) {
                    flag = false;
                    return;
                }
            }
        }
    }
}