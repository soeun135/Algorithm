import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int start_idx = 0;
        int end_idx = N - 1;

        while (start_idx < end_idx) {
            int sum = num[start_idx] + num[end_idx];
            if (sum < M) {
                start_idx++;
            } else if (sum > M) {
                end_idx--;
            } else if (sum == M) {
                cnt++;
                start_idx++;
                end_idx--;
            }
        }
        System.out.println(cnt);
    }
}