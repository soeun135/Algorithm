import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    public String[] solution(int[][] line) {

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if (intersection != null)
                    points.add(intersection);
            }
        }
        
        Point min = getMinimumPoint(points);
        Point max = getMaximumPoint(points);
        
        int width = (int) (max.y - min.y + 1);
        int height = (int) (max.x - min.x + 1);
        
        char[][] arr = new char[width][height];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }
        
        for (Point p : points) {
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);
            arr[y][x] = '*';
        }
        String[] answer = new String[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }
        
        return answer;
    }

    private Point intersection(long a1, long a2, long a3, long b1, long b2, long b3) {
        double x = (double) ((a2 * b3) - (b2 * a3)) / ((a1 * b2) - (a2 * b1));
        double y = (double) ((a3 * b1) - (a1 * b3)) / ((a1 * b2) - (a2 * b1));

        if (x % 1 == 0 && y % 1 == 0) {
            return new Point((long) x, (long) y);
        }
        return null;
    }
    
    private Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        
        return new Point(x, y);
    }
    
    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }

        return new Point(x, y);
    }
}