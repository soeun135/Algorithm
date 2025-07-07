import java.util.*;
import java.io.*;

class Main {
    static List<Integer>[] tree;
    static boolean[] visited;
    static int[] parent;
    static int[] depth;
    static int maxDepth;
    static int k;
    static int[][] p;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        tree = new List[N + 1];
        depth = new int[N + 1];
        visited = new boolean[N + 1];
        parent = new int[N + 1];

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

        k = 0;
        while (!(Math.pow(2, k + 1) > maxDepth)) {
            k++;
        }

        //점화식으로 P배열 마저 채우기
        p = new int[k + 1][N + 1];
        p[0] = parent;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < N + 1; j++) {
                p[i][j] = recursive(i, j);
            }
        }

        //이까지 초기세팅 끝

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == b) {
                System.out.println(a);
                continue;
            }
            LCA(a, b);
        }
    }
    public static void LCA(int a, int b) {
        if (depth[a] != depth[b]) {
            // 깊이가 다르면 깊이 맞춰주기 작업 Math.pow(2, k) <= 깊이 차를 만족하는 2 ^k씩 올라가면서
            int depthDiff = Math.abs(depth[a] - depth[b]);
            int smallDepthNode = depth[a] > depth[b] ? b : a;
            int bigDepthNode = depth[a] > depth[b] ? a : b;

            // 깊이차 >= 2^k인 최대값 k구하기
            int depthK = 0;
            while(Math.pow(2, depthK + 1) <= depthDiff) depthK++;

            bigDepthNode = recursive(depthK, bigDepthNode);

            LCA(smallDepthNode, bigDepthNode);
        } else { // 깊이가 같으면 최소공통 조상 찾기

            for (int i = k; i >= 0; i--) {
                if (p[i][a] == p[i][b]) continue;
                else {
                    if (a == b) continue;
                    else {
                        a = p[i][a];
                        b = p[i][b];
                    }
                }
            }
            if (a == b) System.out.println(a);
            else System.out.println(p[0][a]);
        }
    }
    public static int recursive(int k, int n) {
        //재귀 탈출 조건
        if (p[k][n] != 0 || k == 0) {
            return p[k][n];
        }
        return recursive(k - 1, recursive(k - 1, n));
    }
    public static void bfs(int root) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(root);
        visited[root] = true;

        int level = 1;
        int nowSize = 1; //현재 depth(level)의 크기
        int count = 0; //현재 depth에서 처리한 노드 갯수
        while(!q.isEmpty()) {

            int cur = q.poll();

            for (int child : tree[cur]) {
                if (!visited[child]) {
                    q.offer(child);
                    visited[child] = true;
                    parent[child] = cur;
                    depth[child] = level;
                }
            }
            count++;
            if (count == nowSize) {
                count = 0;
                nowSize = q.size();
                level++;
            }
        }
        maxDepth = level;
    }
}