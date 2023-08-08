import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        ArrayList <String> list = new ArrayList<>();
        String str = String.join("",str_list);
        int lIdx = str.indexOf("l");
        int rIdx = str.indexOf("r");
        if (lIdx == -1 && rIdx == -1) {
            return list.stream().map(x->x).toArray(String[]::new);
        } else if (lIdx == -1 && rIdx != -1) {
            for (int i = rIdx + 1; i < str_list.length ; i++) {
                list.add(str_list[i]);
            }
        } else if (lIdx != -1 && rIdx == -1) {
            for (int i = 0; i < lIdx ; i++) {
                list.add(str_list[i]);
            }
        } else {
            if (lIdx < rIdx) {
            for (int i = 0; i < lIdx ; i++) {
                list.add(str_list[i]);
            }
            } else {
            for (int i = rIdx + 1; i < str_list.length ; i++) {
                list.add(str_list[i]);
            }
            }
        }
        
        return list.stream().map(x->x).toArray(String[]::new);
    }
}