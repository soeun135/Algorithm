import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        Deque <Integer> dq = new ArrayDeque<>();
        IntStream.of(num_list).forEach(x->dq.offer(x));
        for (int i=0; i < num_list.length - n ; i++) {
            dq.offerFirst(dq.pollLast());
        }
        answer = dq.stream().mapToInt(x->x).toArray();
        return answer;
    }
}