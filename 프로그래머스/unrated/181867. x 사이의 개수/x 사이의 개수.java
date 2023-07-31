import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList<>();
        for (String str : myString.split("x")) {
            list.add(str.length());
        }
        if (myString.charAt(myString.length()-1)=='x') {
            list.add(0);
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}