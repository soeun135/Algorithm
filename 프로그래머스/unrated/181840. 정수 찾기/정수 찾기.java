import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        if (list.contains(n)) return 1;
        else return 0;
    }
}