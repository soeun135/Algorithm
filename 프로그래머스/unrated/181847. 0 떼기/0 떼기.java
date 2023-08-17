class Solution {
    public String solution(String n_str) {
        String answer = "";
        for (int i = 0; i < n_str.length(); i++) {
            if (answer.equals("") && n_str.charAt(i) == '0') {
                continue;
            } else {
                answer += n_str.charAt(i);
            }
        }
        return answer;
    }
}