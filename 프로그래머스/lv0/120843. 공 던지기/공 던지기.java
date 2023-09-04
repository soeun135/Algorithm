import java.util.*;

class Solution {
    public static int solution(int[] numbers, int k) {
        int answer = 1;
        int cnt = 0;
        if (k == 1)
            return 1;
        Queue<Integer> q = new LinkedList<>();
        Arrays.stream(numbers).forEach(x->q.offer(x));
        if (numbers.length % 2 == 0) { //배열의 갯수가 짝수번째면
            //짝수번째 인덱스 중에서 k번 째꺼 뽑아오면 됨.
            int i = 0;
            while (cnt != k) {
                answer = numbers[i % numbers.length];
                cnt ++;
                i +=2;
            }
            return answer;
        }
        else {
            while (cnt != k - 1) {
                for (int i = 0; i < 2; i++) {
                    q.add(q.poll());
                }
                cnt++;
            }
            return q.poll();
        }
    }
}