import java.util.*;

class Solution {
    public class Point {
        int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        Queue<Point> q = new LinkedList<>();
        
        q.offer(new Point(0,0));
       
        if(keyinput.length == 0) {
            return answer;
        }
        int idx = 0;
        while(!q.isEmpty()) {
         Point cur = q.poll();
            int dx = cur.x;
            int dy = cur.y;
            switch(keyinput[idx]){
                case "left":
                    dx -= 1;                    
                    break;
                case "right":
                    dx += 1;
                    break;
                case "up":
                    dy += 1;
                    break;
                case "down":
                    dy -= 1;
                    break;
            }
        
            if (Math.abs(dx) > board[0] / 2 || Math.abs(dy) > board[1] / 2) {
                q.offer(new Point(cur.x, cur.y));
                dx = cur.x; dy = cur.y;
            } else {
                q.offer(new Point(dx, dy));
            }
            idx++;
            
            if(idx >= keyinput.length) {
                answer[0] = dx;
                answer[1] = dy;
                break;
            }
        }
        return answer;
    }
}