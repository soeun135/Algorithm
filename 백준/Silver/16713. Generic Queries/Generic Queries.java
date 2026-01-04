import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        int[] xorArr = new int[N + 1];

        int answer = 0;

        st = new  StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (i == 1) {
                xorArr[i] = num;
                continue;
            }

            xorArr[i] = xorArr[i - 1] ^ num;
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());

            int si = Integer.parseInt(st.nextToken());
            int ei = Integer.parseInt(st.nextToken());

            if (i == 0) {
                answer = xorArr[ei] ^ xorArr[si - 1];
            } else {
                answer = answer ^ xorArr[ei] ^ xorArr[si - 1];
            }
        }
        System.out.println(answer);
    }
}