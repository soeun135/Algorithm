class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String temp1 = Integer.toString(a) + Integer.toString(b);
        int temp2 = 2 * a * b;
        answer = Integer.parseInt(temp1) > temp2 ? Integer.parseInt(temp1) : temp2;
        return answer;
    }
}