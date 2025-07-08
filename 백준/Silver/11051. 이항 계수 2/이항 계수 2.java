import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long[][] D = new long[N + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            D[i][0] = 1;
            D[i][i] = 1;
            D[i][1] = i % 10007;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 2; j < i; j++) {
                D[i][j] = (D[i - 1][j - 1] + D[i - 1][j]) % 10007;

                if (i == N && j == K) break;
            }
        }
        System.out.println(D[N][K]);
    }
}