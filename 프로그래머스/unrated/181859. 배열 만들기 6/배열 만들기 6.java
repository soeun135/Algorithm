import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack <Integer>stack = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (stack.peek() == arr[i]) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
            i++;
        }
        if (stack.isEmpty()) {
            stack.push(-1);
        }
        answer = stack.stream().mapToInt(x->x).toArray();
        return answer;
    }
}