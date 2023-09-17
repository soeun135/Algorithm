import java.util.*;

class Solution {
    public boolean check(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n ; i++){
            if(n % i == 0 && check(i)) {
                list.add(i);
                n /= i;
            }    
        }
        Collections.sort(list);
        return list.stream().mapToInt(x->x).toArray();
    }
}