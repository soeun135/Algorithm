import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double d1 = (double)(dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        double d2 = (double)(dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        double d3 = (double)(dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]);
        double d4 = (double)(dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);
        double d5 = (double)(dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);
        double d6 = (double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
        if (d1 == d2) {
            return 1;
        }
        if (d3 == d4) {
            return 1;
        }
        if (d5 == d6) {
            return 1;
        }
        
        return answer;
    }
}