import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] schedule = new int[2000];
        int[] value = new int[2000];
        int[] DP = new int[2000];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            schedule[i] = t;
            value[i] = p;
        }
        if (schedule[N] == 1) DP[N] = value[N];
        for (int i = N - 1; i > 0; i--) {
            if (i + schedule[i] - 1 > N) DP[i] = DP[i + 1];

            else DP[i] = Math.max(DP[i + 1], DP[i + schedule[i]] + value[i]);
        }

        System.out.println(DP[1]);
    }
}