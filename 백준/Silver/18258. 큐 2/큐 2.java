import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String cmd = st.nextToken();
            
            switch(cmd) {
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    if (q.size() > 0) sb.append(q.peek()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "back":
                    if (q.size() > 0) sb.append(q.peekLast()).append("\n");
                    else sb.append("-1\n");
                    break;
                case "pop":
                    if (q.size() > 0) sb.append(q.poll()).append("\n");
                    else sb.append("-1\n");
                    break; 
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty" :
                    if (q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}