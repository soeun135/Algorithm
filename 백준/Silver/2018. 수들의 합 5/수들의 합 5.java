import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int start_idx = 1;
        int end_idx = 1;
        int cnt = 1;
        int sum = 1;
        while (end_idx < N) {
            if (N == 1) break;
            if (sum > N) {
                sum -= start_idx;
                start_idx++;
            }

            if (sum < N) {
                end_idx++;
                sum = sum + end_idx;
            }
            if (sum == N) {
                end_idx++;
                sum = sum + end_idx;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}