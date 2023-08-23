import java.util.*;

class Solution {
    static String arr[][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"*","0","#"}};
    static class Point {
        int x;
        int y;
        int dist;
        Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    public static int calDist (String num, int destination) {
        int d[][] = {{1,0},{0,1},{-1,0},{0, -1}};
        Queue<Point> q = new LinkedList<>();
        int visited[][] = new int[4][3];
        Point cur = null;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j].equals(num)) {
                    cur = new Point(i, j, 0);
                    break;
                }
            }
            if (cur != null) {
                break;
            }
        }
        q.offer(cur);
        visited[cur.x][cur.y] = 1;
        boolean flag = false;
        int dist = -1;
        while (!q.isEmpty()) {
            Point temp = q.poll();

            for (int i = 0; i < 4; i++) {
                int dx = temp.x + d[i][0];
                int dy = temp.y + d[i][1];

                if (dx < 0 || dx >= 4 || dy < 0 || dy >=3 || visited[dx][dy] == 1) {
                    continue;
                }
                if (arr[dx][dy].equals(Integer.toString(destination))) {
                    temp.dist += 1;
                    flag = true;
                    break;
                }
                q.offer(new Point(dx, dy, temp.dist + 1));
                visited[dx][dy] = 1;
            }
            if (flag) {
                dist = temp.dist;
                break;
            }
        }
        return dist;
    }
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, String>map = new HashMap<>();
        map.put("L","*");
        map.put("R", "#");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
            } else {
                if (calDist(map.get("L"), numbers[i]) == calDist(map.get("R"), numbers[i])) {
                    if (hand.equals("right")) {
                        sb.append("R");
                    } else {
                        sb.append("L");
                    }
                } else {
                    String tem = calDist(map.get("L"), numbers[i]) < calDist(map.get("R") , numbers[i]) ? "L" : "R";
                    sb.append(tem);
                }
            }
            map.replace(String.valueOf(sb.charAt(sb.length() - 1)), Integer.toString(numbers[i]));
        }
        return sb.toString();
    }
}