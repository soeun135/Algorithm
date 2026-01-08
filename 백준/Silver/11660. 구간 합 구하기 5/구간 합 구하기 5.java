import java.util.*;
import java.io.*;

class Main {
    public static class Point {
        int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] sum = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(st.nextToken());
                sum[i][j] = sum[i][j - 1] + num;
            }
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            Point start = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Point end = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            int tmp = 0;
            
            if (start.x == end.x && start.y == end.y) {
                sb.append(sum[end.x][end.y] - sum[end.x][end.y - 1]).append("\n");
            } else {
                for (int row = start.x; row <= end.x; row++) {
                    tmp += sum[row][end.y] - sum[row][start.y - 1];
                }
                sb.append(tmp).append("\n");
            }
        }
        System.out.println(sb);
    }
}