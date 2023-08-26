import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[num_list.length - 1 - i]);
        }
        
        return list.stream().mapToInt(x->x).toArray();
    }
}