class Solution {
    public int fac(int i) {
        if (i == 1) {
            return 1;
        }
        return fac(i - 1) * i;
    }
    public int solution(int n) {
        int answer = 0;
        if(n == 1) return 1;
        for(int i = 1 ;i <= 10; i++) {
            if(fac(i) <= n) {
                answer = i;
            }
            else {
                break;
            }
        }
        return answer;
    }
}