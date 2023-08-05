import java.util.*;

class Solution {
    public String solution(String my_string) {
        ArrayList <String> list = new ArrayList<>();
        for (String str : my_string.split("")) {
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        return String.join("",list);
    }
}