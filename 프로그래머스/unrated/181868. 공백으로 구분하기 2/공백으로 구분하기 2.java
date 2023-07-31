import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList <String> list = new ArrayList<>();
        for (String str : my_string.split(" ")) {
            if (str.equals("")){
                continue;
            }
            else {
                list.add(str);
            }
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}