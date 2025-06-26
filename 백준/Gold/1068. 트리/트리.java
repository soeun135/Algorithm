import java.util.*;
import java.io.*;

class Main {
    static int N;
    static boolean[] leafNode;
    static int INF = 100000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        leafNode = new boolean[N];
        Arrays.fill(leafNode, true);

        int[] parent = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            parent[i] = Integer.parseInt(st.nextToken());
        }

        int remove = Integer.parseInt(br.readLine());
        parent[remove] = INF;

        Queue<Integer> q = new LinkedList<>();
        q.offer(remove);

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 0; i < parent.length; i++) {
                if (parent[i] == cur) {
                    q.offer(i);
                    parent[i] = INF;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (parent[i] == INF) { // 삭제된 노드이면 루트노드 불가능
                leafNode[i] = false;
            }
            else if (parent[i] != -1) // 자식이 있으면 == 부모노드 배열에서 자기 값을 가리키는 애가 있으면
                leafNode[parent[i]] = false;
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (leafNode[i]) answer++;
        }
        System.out.println(answer);
    }


}