class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        answer = Integer.parseInt(a1 + b1) > Integer.parseInt(b1 + a1) ? Integer.parseInt(a1 + b1) : Integer.parseInt(b1 + a1);
        return answer;
    }
}