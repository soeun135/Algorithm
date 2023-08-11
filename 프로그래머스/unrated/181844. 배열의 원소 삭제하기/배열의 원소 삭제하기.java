import java.util.*;
import java.util.stream.IntStream;
import java.util.Collections;
import java.util.stream.Collectors;


class Solution {
   public static int[] solution(int[] arr, int[] delete_list) {
        LinkedHashSet <Integer>set = new LinkedHashSet<>();
       for (int i : arr) {
           set.add(i);
       }
        HashSet <Integer>set2 = new HashSet<>(Arrays.stream(delete_list).boxed().collect(Collectors.toSet()));
        set.removeAll(set2);
       
        return set.stream().mapToInt(x->x).toArray();
    }
}