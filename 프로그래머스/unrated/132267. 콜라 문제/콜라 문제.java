class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            int cola =  n/a;
            answer += (cola*b);
            n %= a;
            n+=(cola*b);
        }
        return answer;
    }
}