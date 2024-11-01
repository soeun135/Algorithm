import java.util.*;
import java.io.*;

public class Main {
    static int N, S;
    static int[] nArray;
    static boolean[] visited;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nArray = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nArray[i] = Integer.parseInt(st.nextToken());
        }

        recur(0, 0);
        if (S == 0) result--;
        System.out.println(result);
    }
    public static void recur(int num, int sum) {
        if (num == N) {
            if (sum == S) {
                result++;
            }
            return;
        }

        recur(num + 1, sum + nArray[num]);
        recur(num + 1, sum);
    }
}