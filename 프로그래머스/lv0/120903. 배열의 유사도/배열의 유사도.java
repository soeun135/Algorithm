import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set1 = Arrays.stream(s1).collect(Collectors.toSet());
        Set<String> set2 = Arrays.stream(s2).collect(Collectors.toSet());
        
        
        set1.retainAll(set2);
        return set1.size();
    }
}