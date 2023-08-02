class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean tmp1 = x1 || x2;
        boolean tmp2 = x3 || x4;
        answer = tmp1 && tmp2;
        return answer;
    }
}