import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public static int[] solution(int[] num_list, int n) {
            return IntStream.range(0, n).map(i -> num_list[i]).toArray();
        }
}