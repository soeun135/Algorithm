import java.util.*;
import java.io.*;

class Main {
    static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        K = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        int cnt = 0;

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) continue;
            for (int j = i; j <= N; j+=i) {
                if (arr[j] == 0) continue;

                arr[j] = 0;
                cnt++;
                if (check(cnt)) {
                    System.out.println(j);
                    return;
                }

            }
        }
    }

    private static boolean check(int cnt) {
        if (cnt == K) {
            return true;
        }
        return false;
    }
}