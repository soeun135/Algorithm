import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int t = Integer.parseInt(br.readLine());

        int remainX = (p + t) % (2 * w);
        int remainY = (q + t) % (2 * h);

        int curX = 0;
        int curY = 0;
        if (remainX >= 0 && remainX <= w) {
            curX = remainX;
        } else {
            curX = 2 * w - remainX;
        }
        
        if (remainY >= 0 && remainY <= h) {
            curY = remainY;
        } else {
            curY = 2 * h - remainY;
        }
        System.out.println(curX + " " + curY);
        br.close();
    }
}