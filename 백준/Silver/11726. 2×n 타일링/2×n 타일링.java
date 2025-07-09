import java.io.*;
import java.util.*;

class Main {
    static int[] DP;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        DP = new int[10001];

        Arrays.fill(DP, -1);

        DP[1] = 1;
        DP[2] = 2;

        if (N == 1) {
            System.out.println(1);
            return;
        } else if (N == 2) {
            System.out.println(2);
            return;
        }
        for (int i = 3; i <= N; i++) {
            DP[i] = (DP[i - 1] + DP[i - 2]) % 10007;
        }
        System.out.println(DP[N]);
        scanner.close();
    }

    private static int fibo(int n) {
        if (DP[n] != -1) return DP[n];

        return DP[n] = (fibo(n - 1) + fibo(n - 2)) % 10007;
    }
}