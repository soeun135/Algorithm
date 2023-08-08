import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = n ; i <= num_list.length ; i++) {
            list.add(num_list[i - 1]);
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}