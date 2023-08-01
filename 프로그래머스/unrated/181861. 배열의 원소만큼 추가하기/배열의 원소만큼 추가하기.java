import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i ; j++) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}