import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap <Integer, Integer>map = new HashMap<>();
        ArrayList <Integer>list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        
        if (array == null || array.length == 0) {
            return 0;
        }
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            list.add(item.getValue());
            if (max < item.getValue()) {
                answer = item.getKey();
                max = item.getValue();
            }
        }
        int cnt = 0;
        for (int i : list) {
            if (max == i) {
                cnt ++;
            }
        }
        if (cnt >= 2) return -1;
        return answer;
    }
}