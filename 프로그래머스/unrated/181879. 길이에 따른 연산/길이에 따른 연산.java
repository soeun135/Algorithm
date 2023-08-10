import java.util.*;

class Solution {
    public static int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            return Arrays.stream(num_list).sum();
        } else {
            return Arrays.stream(num_list).reduce((x, y)-> x * y).getAsInt();
        }
    }
}