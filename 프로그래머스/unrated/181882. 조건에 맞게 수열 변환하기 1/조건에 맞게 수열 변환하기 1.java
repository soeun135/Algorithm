import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer>list = new ArrayList<>();
        for (int i : arr) {
            if (i >= 50 && i % 2 == 0) {
                list.add(i / 2);
            } else if (i < 50 && i % 2 != 0){
                list.add(i * 2);
            } else {
                list.add(i);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}