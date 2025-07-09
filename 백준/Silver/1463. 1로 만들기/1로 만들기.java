import java.util.*;
import java.io.*;

class Main {
    static int[] DP;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        DP = new int[1000001];

        Arrays.fill(DP, Integer.MAX_VALUE);
        DP[1] = 0;
        DP[2] = 1;

        for (int i = 3; i <= N; i++) {

            DP[i] = DP[i - 1] + 1;

            if (i % 3 == 0) DP[i] = Math.min(DP[i], DP[i / 3] + 1);
            if (i % 2 == 0) DP[i] = Math.min(DP[i], DP[i / 2] + 1);
        }
        //dp(N);

        System.out.println(DP[N]);
        sc.close();
    }

    private static int dp (int n) {
        if (DP[n] != Integer.MAX_VALUE) {
            return DP[n];
        }

        if (n % 3 == 0)  DP[n] = Math.min(DP[n], dp(n / 3));
        if (n % 2 == 0)  DP[n] = Math.min(DP[n], dp(n / 2));
        DP[n] = Math.min(DP[n], dp(n - 1));

         return DP[n] += 1;
    }
}