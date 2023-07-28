import java.util.ArrayList;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    if (arr[j] < min) {
                        min = arr[j];
                    }
                }
            }
            if (min == Integer.MAX_VALUE) {
                list.add(-1);
            } else {
                list.add(min);
            }
        }
        answer = list.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}