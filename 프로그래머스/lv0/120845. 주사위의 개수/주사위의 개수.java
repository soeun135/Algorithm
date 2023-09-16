class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int row = box[0] / n;
        int m = row * (box[1] / n);
        answer = m * (box[2] / n);
        return answer;
    }
}