import java.util.*;

class Solution {
    public static int solution(int[] arr) {
        int answer = 0;
        while (true) {
            ArrayList <Integer>list = new ArrayList<>();
            for (int i : arr) {
                if (i >= 50 && i % 2 == 0) {
                    list.add(i / 2);
                } else if (i < 50 && i % 2 != 0) {
                    list.add(i * 2 + 1);
                } else {
                    list.add(i);
                }
            }
            if (list.toString().equals(Arrays.toString(arr))) { //아무변화가 없으면 break;
                break;
            } else {
                arr = list.stream().mapToInt(x -> x).toArray();
                answer++;
            }
        }
        return answer;
    }
}