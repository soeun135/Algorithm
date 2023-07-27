import java.util.*;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int item : arr) {
            list.add(item);
        }
        for (int i = 0; i < queries.length; i++) {
            int tmp1  = list.get(queries[i][0]);
            int tmp2 = list.get(queries[i][1]);
            list.set(queries[i][1], tmp1);
            list.set(queries[i][0], tmp2);
        }
        answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}