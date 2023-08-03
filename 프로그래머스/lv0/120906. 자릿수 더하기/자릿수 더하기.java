class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            int rest = n % 10;
            answer += rest;
            
            n /= 10;
        }
        return answer;
    }
}