import java.util.*;
import java.io.*;

class Main {
    static long[] tree;
    static int flag;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        flag = 1;

        while (Math.pow(2, flag) < N) {
            flag++;
        }
        int treeSize = (int) Math.pow(2, flag) * 2;
        int startIdx = (int) Math.pow(2, flag);
        int tmpIdx = startIdx;

        tree = new long[treeSize];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            tree[tmpIdx++] = Long.parseLong(st.nextToken());
        }
        for (int i = startIdx - 1; i > 0; i--) {
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }

        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 1) {
                updateTree(b, c);

            } else {
                preSum(b, c);
            }
        }
    }
    private static int getSegIdx(int idx) {
        return idx + ((int) Math.pow(2, flag) - 1);
    }

    private static void updateTree(int idx, long value) {
        idx = getSegIdx(idx);

        tree[idx] = value;

        while (idx / 2 > 0) {
            int parent = idx / 2;
            tree[parent] = tree[parent * 2] + tree[parent * 2 + 1];

            idx = parent;
        }
    }
    private static void preSum(int startIdx, long endIdx) {
        startIdx = getSegIdx(startIdx);
        endIdx = getSegIdx((int) endIdx);

        long sum = 0;
        while(startIdx <= endIdx) {
            if (startIdx % 2 == 1)    sum += tree[startIdx];

            if (endIdx % 2 == 0) sum += tree[(int)endIdx];

            startIdx = (startIdx + 1) / 2;
            endIdx = (endIdx - 1) / 2;
        }
        System.out.println(sum);
    }
}