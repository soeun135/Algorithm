class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int idx = 1;
        String temp = Integer.toString(num);
        for (String str : temp.split("")) {
            if (Integer.parseInt(str) == k) {
                return idx;
            }
            idx++;
        }
        return answer;
    }
}