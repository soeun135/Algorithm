import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        answer += check(sides[1], sides[0]);
        for(int i = sides[1] + 1 ; i < sides[0] + sides[1] ; i++) {
            answer++;
        }
        return answer;
    }
    public int check(int val, int rest) {
        int cnt = 0;
        for(int i = 1; i <= val; i++) {
            if(rest + i > val) {
                cnt++;
            }
        }
        return cnt;
    }
}