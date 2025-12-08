import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String N = br.readLine();
        
        int M = Integer.parseInt(br.readLine());
        
        Stack<Character> lStack = new Stack<>();
        Stack<Character> rStack = new Stack<>();
        
        for (int i = 0; i < N.length(); i++) {
            lStack.push(N.charAt(i));
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            char cmd = st.nextToken().charAt(0);
            
            switch(cmd) {
                case 'L':
                    if (!lStack.isEmpty())
                        rStack.push(lStack.pop());
                    break;
                case 'D':
                    if (!rStack.isEmpty())
                        lStack.push(rStack.pop());
                    break;
                case 'B':
                    if (!lStack.isEmpty())
                        lStack.pop();
                    break;
                case 'P':
                    lStack.push(st.nextToken().charAt(0));
                    break;
            }
        }
        while (!lStack.isEmpty()) {
            rStack.push(lStack.pop());
        }
        while (!rStack.isEmpty()) {
            sb.append(rStack.pop());
        }
        
        System.out.println(sb.toString());
        br.close();
    }
}