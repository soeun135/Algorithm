import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static Point[] pointArr;
    static long answer = Long.MAX_VALUE;

    static class Point {
        long x;
        long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        pointArr = new Point[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            pointArr[i] = new Point(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));

        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                getWidth(i, j);
            }
        }
        System.out.println(answer);
    }

    private static void getWidth(int exclude1, int exclude2) {
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;


        for (int i = 0; i < N; i++) {
            if (i == exclude1 || i == exclude2) continue;
            Point cur = pointArr[i];
            if (cur.x < minX) minX = cur.x;
            if (cur.y < minY) minY = cur.y;
            if (cur.x > maxX) maxX = cur.x;
            if (cur.y > maxY) maxY = cur.y;
        }

        long dx = maxX - minX + 2;
        long dy = maxY - minY + 2;

        long side = Math.max(dx, dy);
        long curArea = side * side;
        if (answer > curArea) answer = curArea;
    }
}