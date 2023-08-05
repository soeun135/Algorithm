import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 1000;
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            if (min > Math.abs(array[i] - n)) {
                answer = array[i];
                min = Math.abs(array[i] - n);
            }
        }
        
        return answer;
    }
}