import java.util.*;

class Solution {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap <Integer, String>map = new HashMap<>();
        for (int i = 0; i < keymap.length ; i++) {
            map.put(i, keymap[i]);
        }
        for (int i = 0; i < targets.length; i++) {
            String temp = targets[i];

            for (int j = 0; j < temp.length() ; j++) {
                char c = temp.charAt(j);

                int minIdx = Integer.MAX_VALUE;
                for (Map.Entry<Integer,String>item : map.entrySet()) {
                    if (item.getValue().contains(String.valueOf(c))) {
                        if (minIdx > item.getValue().indexOf(c)) {
                            minIdx = item.getValue().indexOf(c);
                        }
                    }
                }
                if (minIdx == Integer.MAX_VALUE) {
                    answer[i] = -1;
                } else if (answer[i] != -1){
                    answer[i] += (minIdx+1);
                }
            }
        }
        return answer;
    }
}