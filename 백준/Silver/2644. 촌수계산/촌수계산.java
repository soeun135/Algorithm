import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


import java.util.*;
import java.io.*;

public class Main {
    static int n, s, e, m;
    static List[] vertex;
    static boolean[] visited;
    static int cnt = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        vertex = new List[n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            vertex[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            vertex[x].add(y);
            vertex[y].add(x);
        }
        visited[s] = true;
//        dfs(s);

        bfs(s);

//        if (!flag) {
//            System.out.println(-1);
//        }
    }
    static boolean flag = false;
    public static class Node {
        int num, chon;

        public Node(int num, int chon) {
            this.num = num;
            this.chon = chon;
        }
    }

    public static void bfs(int s) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(s, 0));
        visited[s] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            for (int i = 0; i < vertex[cur.num].size(); i++) {

                if (e == (int) vertex[cur.num].get(i)) {
                    System.out.println(cur.chon + 1);
                    return;
                }
                if (!visited[(int) vertex[cur.num].get(i)]) {
                    q.offer(new Node((int) vertex[cur.num].get(i), cur.chon + 1));
                    visited[(int) vertex[cur.num].get(i)] = true;
                }
            }
        }
                System.out.println(-1);

    }
    public static void dfs(int s) {

        for (int i = 0; i < vertex[s].size(); i++) {
            if (e == (int) vertex[s].get(i)) {
                System.out.println(cnt + 1);
                flag = true;
                return;
            }
            if (!visited[(int) vertex[s].get(i)]) {
                visited[(int) vertex[s].get(i)]  = true;
                cnt++;
                dfs((int) vertex[s].get(i));
            }
        }
    }
}
