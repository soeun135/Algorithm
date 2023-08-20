import java.util.*;

class Solution {
    public static String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            if (5 <= choices[i] && choices[i] <= 7) {
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + choices[i] - 4);

            } else if (1 <= choices[i] && choices[i] <= 3) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + Math.abs(choices[i] - 4));
            }
        }
        char[] arr = {'R','C','J','A'};
        int[] value = new int[4];
        for (Map.Entry<Character, Integer>item : map.entrySet()) {

            if (item.getKey() == 'R' || item.getKey() == 'T') {
                if (value[0] < item.getValue()) {
                        arr[0] = item.getKey();
                        value[0] = item.getValue();

                }
            } else if (item.getKey() == 'C' || item.getKey() == 'F') {
                if (value[1] < item.getValue()) {
                        arr[1] = item.getKey();
                        value[1] = item.getValue();
                }
            } else if (item.getKey() == 'J' || item.getKey() == 'M'){
                if (value[2] < item.getValue()) {
                        arr[2] = item.getKey();
                        value[2] = item.getValue();
                }
            } else {
                if (value[3] < item.getValue()) {
                        arr[3] = item.getKey();
                        value[3] = item.getValue();
                    }
            }
        }
        return String.valueOf(arr);
    }
}