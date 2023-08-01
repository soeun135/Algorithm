import java.util.*;
import java.util.stream.IntStream;


class Solution {
   public static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList <Integer>result = new ArrayList<>();
        ArrayList <Integer>list2 = new ArrayList<>();
        IntStream.of(delete_list).forEach(list2::add);
       
        for (int i = 0; i < arr.length ; i++) {
            if (!list2.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        answer = result.stream().mapToInt(x->x).toArray();
        return answer;
    }
}