import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List <Integer> list = new ArrayList<>();
        for (int x[] : intervals) {
            for (int i = x[0] ; i <= x[1] ; i++) {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}