import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //노드
        int M = Integer.parseInt(st.nextToken()); //간선

        //그래프 만들기 - 인접리스트로 구현 무방향그래프이므로 양방향.
        List<Integer>[] graph = new List[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        int[] result = new int[N];

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[N + 1];

        int idx = 0;
        int answer = 0;
        for (int i = 1; i < N + 1; i++) {
            if (visited[i]) continue;
            stack.add(i);
            answer++;

            while (!stack.isEmpty()) {
                int cur = stack.pop();


                for (int nearNode : graph[cur]) {
                    if (!visited[nearNode]) {
                        stack.push(nearNode);
                        visited[nearNode] = true;
                    }
                }
                visited[cur] = true;
                result[idx++] = cur;
            }
        }
//        for (int x : result) {
//            System.out.println(x);
//        }

        System.out.println(answer);
    }
}