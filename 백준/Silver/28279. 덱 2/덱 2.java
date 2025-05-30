import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            switch(cmd) {
                case "1":
                    dq.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    dq.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.poll()+"\n");
                    break;
                case "4":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.pollLast()+"\n");
                    break;
                case "5":
                    sb.append(dq.size()).append("\n");
                    break;
                case "6":
                    sb.append(dq.isEmpty() ? "1\n" : "0\n");
                    break;
                case "7":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.peek() + "\n");
                    break;
                case "8":
                    sb.append(dq.isEmpty() ? "-1\n" : dq.peekLast() + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}