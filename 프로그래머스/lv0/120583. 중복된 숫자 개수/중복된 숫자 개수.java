import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        if (map.get(n) != null) {
            return map.get(n);
        } else {
            return 0;
        }
    }
}