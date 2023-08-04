class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = "369";
        String num = Integer.toString(order);
        for (String s : num.split("")) {
            if (str.contains(s)) answer ++;
        }
        return answer;
    }
}