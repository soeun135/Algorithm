class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            while (i != 0) {
                int rest = i % 10;
                if(rest == 7) {
                    answer++;
                }
                i /= 10;
            }
        }
        return answer;
    }
}