import java.util.*;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
      
        for(int x[] : queries) {
            int tmp = arr[x[0]];
            arr[x[0]] = arr[x[1]];
            arr[x[1]] = tmp;
        }
        answer = arr;
        return answer;
    }
}