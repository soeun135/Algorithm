import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList<>();
        for (String i : intStrs) {
            String temp = i.substring(s, s + l);
            
            if (Integer.parseInt(temp) > k) {
                list.add(Integer.parseInt(temp));
            }
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}