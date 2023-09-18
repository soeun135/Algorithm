import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        for(String str : s.split(" ")) {
            if(str.equals("Z"))
                stack.pop();
            else 
                stack.push(str);
        }
        while(!stack.isEmpty()) {
            answer += Integer.parseInt(stack.pop());
        }
        return answer;
    }
}