import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList <String> list = new ArrayList<>();
        for (String s : my_string.split(" ")) {
            list.add(s);
        }
        return list.stream().toArray(String[]::new);
    }
}