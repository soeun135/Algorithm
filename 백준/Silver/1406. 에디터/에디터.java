import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String N = br.readLine();
        
        int M = Integer.parseInt(br.readLine());
        
        Deque<Character> lStack = new ArrayDeque<>();
        Deque<Character> rStack = new ArrayDeque<>();
        
        for (int i = 0; i < N.length(); i++) {
            lStack.push(N.charAt(i));
        }
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            
            char cmd = str.charAt(0);
            
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
                    lStack.push(str.charAt(2));
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