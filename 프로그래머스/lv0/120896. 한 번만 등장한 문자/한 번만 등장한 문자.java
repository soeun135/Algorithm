import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

class Solution {
    public static String solution(String s) {

        Hashtable <String, Integer>map = new Hashtable<>();
        ArrayList <String>list = new ArrayList<>();
        for (String i : s.split("")) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<String, Integer>item : map.entrySet()) {
            if (item.getValue() == 1) {
                list.add(item.getKey());
            }
        }
        Collections.sort(list);
        
        return String.join("",list);
    }
}