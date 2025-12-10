import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int outCnt = 1;

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++){
            q.offer(i + 1);
        }
        sb.append("<");

        while (q.size() > 1){

            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append(">");
        System.out.println(sb);
        br.close();
    }
}