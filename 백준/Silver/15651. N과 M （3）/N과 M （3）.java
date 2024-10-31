import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result =  new int[M];

        recur(0);
        System.out.println(sb.toString());
    }

    public static void recur(int num) {
        if (num == M) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N ; i++) {

            result[num] = i;
            recur(num + 1);

        }


    }
}
