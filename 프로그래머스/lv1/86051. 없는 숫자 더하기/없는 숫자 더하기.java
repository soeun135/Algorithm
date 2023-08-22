import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <=9; i++) {
            map.put(i, 0);
        }
        for (int i : numbers) {
            map.replace(i, map.get(i) + 1);
        }
        for (Map.Entry<Integer, Integer>item : map.entrySet()) {
            if (item.getValue() == 0) {
                answer += item.getKey();
            }
        }
        return answer;
    }
}