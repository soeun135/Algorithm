import java.util.ArrayList;

class Solution {
    public static ArrayList solution(int n) {
            ArrayList<Integer> answer = new ArrayList();
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    answer.add(i);
                }
            }
            return answer;
        }
}