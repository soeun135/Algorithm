import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int answer = 0;
        for (int i = p1; i < N; i++) {
            int total = 0;
            int p2 = i;
            while (total < M && p2 < N) {
                total += arr[p2++];

                if (total == M) {
                    answer++;
                    break;
                } else if (total > M) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
