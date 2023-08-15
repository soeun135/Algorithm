import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        List <Integer>list = new ArrayList<>();
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //길이가 2의 거듭제곱이 되도록
        int cnt = 0;
        int n = list.size();
        while (n > 1) {
            n /= 2;
            cnt++; //list.size()가 2의 몇 승 이상인지
        }
         if (list.size() != (int)Math.pow(2, cnt)) {
            while (list.size() != (int)Math.pow(2,cnt + 1)) {
                list.add(0);
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}