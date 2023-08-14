import java.util.*;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        ArrayList <String>list = new ArrayList<>();
        myStr = myStr.replaceAll("a","_");
        myStr = myStr.replaceAll("b","_");
        myStr = myStr.replaceAll("c","_");
        
        for (String str : myStr.split("_")) {
            list.add(str);
        }
        ArrayList <String>result = new ArrayList<>();
        for (String str : list) {
            if (!str.equals("")) {
                result.add(str);
            }
        }
        if (result.size() == 0) {
            result.add("EMPTY");
        }
        answer = result.stream().toArray(String[]::new);
        return answer;
    }
}