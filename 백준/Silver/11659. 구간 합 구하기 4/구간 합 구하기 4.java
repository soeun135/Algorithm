import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] origin = new int[N + 1];
        int[] sum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            origin[i] = Integer.parseInt(st.nextToken());

            if (i == 0) {
                sum[i] = origin[i];
            } else {
                sum[i] = sum[i - 1] + origin[i];
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(sum[end] - sum[start - 1]);
        }
    }
}