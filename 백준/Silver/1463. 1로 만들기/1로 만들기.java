import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] DP = new int[1000001];

        Arrays.fill(DP, Integer.MAX_VALUE);
        DP[1] = 0;
        DP[2] = 1;

        for (int i = 3; i <= N; i++) {

            if (i % 3 == 0) DP[i] = Math.min(DP[i], DP[i / 3]);
            if (i % 2 == 0) DP[i] = Math.min(DP[i], DP[i / 2]);
            DP[i] = Math.min(DP[i], DP[i - 1]);

            DP[i] += 1;
        }

        System.out.println(DP[N]);
        sc.close();
    }
}