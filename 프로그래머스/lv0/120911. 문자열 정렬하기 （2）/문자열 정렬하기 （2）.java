import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();

        char str[] = my_string.toCharArray();
        Arrays.sort(str);
        
        return new String(str);
    }
}