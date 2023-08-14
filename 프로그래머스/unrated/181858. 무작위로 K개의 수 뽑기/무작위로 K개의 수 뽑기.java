import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        ArrayList <Integer>list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
            if (list.size() == k) {
                break;
            }
        }
        while (list.size() != k) {
            list.add(-1);
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}