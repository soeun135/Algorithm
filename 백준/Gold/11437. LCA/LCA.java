import java.util.*;
import java.io.*;

class Main {
    static List<Integer>[] tree;
    static boolean[] visited;
    static int[] parent;
    static int[] depth;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        tree = new List[N + 1];
        visited = new boolean[N + 1];
        parent = new int[N + 1];
        depth = new int[N + 1];
        
        for (int i = 1; i < N + 1; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            tree[a].add(b);
            tree[b].add(a);
        }
        
        bfs(1);
        
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            LCA(a, b);
        }
    }
    private static void LCA(int a, int b) {
        if (depth[a] < depth[b]) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (depth[a] != depth[b]) {
            a = parent[a];
        }
        while (a != b) {
            a = parent[a];
            b = parent[b];
        }
        System.out.println(a);
    }
    
    private static void bfs(int root) {
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(root);
        visited[root] = true;
        
        int level = 1;
        int nowSize = 1;
        int count = 0;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            
            for (int next : tree[cur]) {
                if (!visited[next]) {
                    q.offer(next);
                    visited[next] = true;
                    parent[next] = cur;
                    depth[next] = level;
                    
                }
            }
            count++;
            
            if (count == nowSize) {
                count = 0;
                level ++;
                nowSize = q.size();
            }
        }
    }
}