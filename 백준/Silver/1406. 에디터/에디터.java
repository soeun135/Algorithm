import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            char cmd = st.nextToken().charAt(0);

            switch (cmd) {
                case 'L':
                    if (!leftStack.isEmpty())
                        rightStack.push(leftStack.pop());
                    break;
                case 'D':
                    if (!rightStack.isEmpty())
                        leftStack.push(rightStack.pop());
                    break;
                case 'B':
                    if (!leftStack.isEmpty())
                        leftStack.pop();
                    break;
                case 'P':
                    leftStack.push(st.nextToken().charAt(0));
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = leftStack.size(); i > 0; i--) {
            sb.append(leftStack.pop());
        }
        System.out.print(sb.reverse());
        
        sb = new StringBuilder();
        for (int i = rightStack.size(); i > 0; i--) {
            sb.append(rightStack.pop());
        }

        System.out.print(sb);
    }
}