import java.util.*;

class Solution {
    public static int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = l; i<=r ; i++) {
            boolean flag = false;
            int num = i;
            int rest;
            while(num != 0){
                rest = num % 10;
                if (rest == 0 || rest == 5 ) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if (flag) {
                list.add(i);
            }
        }
        if(list.size() == 0) {
            list.add(-1);
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}