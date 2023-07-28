import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        ArrayList <Integer>list = new ArrayList<>();
        for (int i = start ; i<=end ;i++) {
            list.add(i);
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}