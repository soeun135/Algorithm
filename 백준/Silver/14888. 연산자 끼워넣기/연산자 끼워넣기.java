import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] num;
    static int[] op;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        num = new int[N];
        op = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        recur(num[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void recur(int cur, int depth) {
        if (depth == N) {
            max = Math.max(max, cur);
            min = Math.min(min, cur);
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;
                int nextResult = calculate(cur, num[depth], i);
                recur(nextResult, depth + 1);
                op[i]++;
            }
        }
    }

    public static int calculate(int a, int b, int op) {
        switch (op) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
        }
        return 0;
    }
}
