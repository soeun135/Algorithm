import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Stack <Integer>stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) { //다 돌면 중복없이 남아있음.
            if(stack.isEmpty())
                stack.push(arr[i]);
            else{
                if(stack.peek() == arr[i]){
                    continue;
                }
                 else stack.push(arr[i]);

            }
        }
        int[] answer = new int[stack.size()];

        while(!stack.isEmpty()){
            answer[stack.size()-1] = stack.pop();
        }
        
        return answer;
    }
}