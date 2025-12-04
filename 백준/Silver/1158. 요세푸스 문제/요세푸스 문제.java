import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int outCnt = 1;
        int idx = k - 1;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++){
            //arr[i] = i + 1;
            q.offer(i + 1);
        }
        sb.append("<");
        arr[idx] = 0;


        while (!q.isEmpty()){

            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll());

            if (!q.isEmpty()) sb.append(", ");
        }

        sb.append(">");
        System.out.println(sb);
        br.close();
    }
}