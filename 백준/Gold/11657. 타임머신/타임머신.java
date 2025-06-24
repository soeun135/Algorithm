import java.io.*;
import java.util.*;

class Main {
    static class Edge {
        int s, e, w;

        public Edge(int s, int e, int w) {
            this.s = s;
            this.e = e;
            this.w = w;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Edge> graph = new ArrayList<>();
        long[] D = new long[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.add(new Edge(a, b, c));
        }
        Arrays.fill(D, Integer.MAX_VALUE);
        D[1] = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j< M; j++) {
                Edge edge = graph.get(j);

                if (D[edge.s] == Integer.MAX_VALUE) continue;
                if (D[edge.s] != Integer.MAX_VALUE && D[edge.e] > D[edge.s] + edge.w) {
                    D[edge.e] = D[edge.s] + edge.w;
                }
            }
        }
        boolean change = false;
        for (int j = 0; j < M; j++) {
            Edge edge = graph.get(j);

            if (D[edge.s] == Integer.MAX_VALUE) continue;
            if (D[edge.s] != Integer.MAX_VALUE && D[edge.e] > D[edge.s] + edge.w) {
                change = true;
                break;
            }
        }
        if (change) {
            System.out.println(-1);
        } else {
            for (int i = 2; i < D.length; i++) {
                if (D[i] == Integer.MAX_VALUE) System.out.println(-1);
                else System.out.println(D[i]);
            }
        }
    }
}