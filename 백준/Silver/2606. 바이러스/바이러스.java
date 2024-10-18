import java.io.*;
import java.util.*;

class Main {
    static List[] connections;
    static boolean[] visited;

    static int cnt, edgeCnt, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cnt = Integer.parseInt(br.readLine());
        edgeCnt = Integer.parseInt(br.readLine());

        connections = new List[cnt + 1];
        visited = new boolean[cnt + 1];

        for (int i = 0; i < cnt + 1; i++) {
            connections[i] = new ArrayList<>();
        }

        for (int i = 0; i < edgeCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            connections[s].add(e);
            connections[e].add(s);
        }

        bfs(1);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();


            for (int i = 0; i < connections[cur].size(); i++) {
                int next = (int) connections[cur].get(i);
                if (!visited[next]) {
                    answer++;
                    q.offer(next);
                    visited[(int) connections[cur].get(i)] = true;
                }
            }
        }
        System.out.println(answer);
    }
}