import java.util.*;
import java.io.*;

class Main {
    static int[] node;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        node = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            node[i] = i;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (op == 0) {
                union(a, b);
            } else {
                String answer = (find(a) == find(b) ? "yes" : "no");
                System.out.println(answer);
            }
        }
    }
    private static void union(int a, int b) {
        int i = find(a);
        int j = find(b);
        node[j] = i;
    }
    private static int find(int a) {
        // 재귀 탈출 조건
        if (a == node[a]) {
            return a;
        }

        return node[a] = find(node[a]);
    }
}