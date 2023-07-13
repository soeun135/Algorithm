import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList answer = new ArrayList();
        for(int x : arr){
            if(x % divisor == 0){
                answer.add(x);
            }
        }
        Collections.sort(answer);
        if (answer.size() == 0) answer.add(-1);
        return answer;
    }
}