import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = -1;
            if (num1 == 1) {
                num2 = Integer.parseInt(st.nextToken());
            }
            switch (num1) {
                case 1:
                    stack.push(num2);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        bw.write(stack.pop() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4:
                    if (!stack.isEmpty()) {
                        bw.write(0 + "\n");
                    } else {
                        bw.write(1 + "\n");
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        bw.write(stack.peek() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}