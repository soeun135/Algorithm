import java.util.*;

class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList <Integer>list = new ArrayList<>();
        HashMap <Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < attendance.length ; i++) {
            if (attendance[i]) {
                map.put(rank[i], i); //등수와 인덱스를 차례로 넣음.
                list.add(rank[i]);
            }
        }
        Collections.sort(list); //등수별 오름차순
        int a = 10000 * map.get(list.get(0));
        int b = 100 * map.get(list.get(1));
        int c = map.get(list.get(2));
        
        return a + b + c;
    }
}