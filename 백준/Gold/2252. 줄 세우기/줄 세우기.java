import java.io.*;
import java.util.*;

class Main {
    static ArrayList<Integer>[] graph;
    static int[] D;
    static boolean[] visited;
    static int[] answer;
    static int idx = 0;
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        D = new int[N + 1];
        visited = new boolean[N + 1];
        answer = new int[N];
        
        for (int i = 1; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            graph[a].add(b);
            D[b]++;
        }
         wisang();
        
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
    private static void wisang() {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 1; i < N + 1; i++) {
            if (D[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
            
            if (!visited[cur]) {
                visited[cur] = true;
                answer[idx++] = cur;
                for (int j : graph[cur]) {
                    D[j]--;
                    
                    if (D[j] == 0) q.offer(j);
                }
            }
        }
    }
}