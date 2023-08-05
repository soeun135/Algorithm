import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        ArrayList <Integer> list = new ArrayList<>();
        IntStream.of(indices).forEach(list::add);
        for (int i = 0; i < my_string.length() ; i++) {
            char c = my_string.charAt(i);
            if (list.contains(i)) {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}