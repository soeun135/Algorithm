import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            //절대값이 가장 작은 값 !!!!
            if (Math.abs(o1) == Math.abs(o2)) { //절대값이 같으면 음수 먼저 출력
                return o1 - o2;
            } else { // 절대값이 같지 않으면 그냥 작은 값 !
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (pq.size() == 0) {
                    sb.append("0\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.offer(x);
            }
        }
        System.out.print(sb);
    }
}