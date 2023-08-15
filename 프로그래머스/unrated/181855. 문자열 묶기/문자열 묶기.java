import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap <Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
            if (answer < map.get(strArr[i].length())) {
                answer = map.get(strArr[i].length());
            }
        }
        return answer;
    }
}