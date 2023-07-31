import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        ArrayList <String> list = new ArrayList();
        for (String str : myString.split("x")){
            if(str.equals("")){
                continue;
            }
            list.add(str);
        }
        Collections.sort(list);
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}