import java.util.*;

class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap <Integer, Integer>map = new HashMap<>();
        ArrayList <Integer>list = new ArrayList<>();
        for (int i = 0; i < rank.length ; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
                list.add(rank[i]);
            }
        }
        Collections.sort(list);

        answer += map.get(list.get(0)) * 10000;
        answer += map.get(list.get(1)) * 100;
        answer += map.get(list.get(2));
        return answer;
    }
}