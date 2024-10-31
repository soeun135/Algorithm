import java.util.*;
import java.io.*;

public class Main {

    static int N, M;
    static int[] nArray;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nArray = new int[N];
        visited = new boolean[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArray);
        recur(0);
        System.out.println(sb.toString());
    }
    public static void recur(int num) {
        if (M == num) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;

                result[num] = nArray[i];
                recur(num + 1);

                visited[i] = false;
            }
        }
    }
}
