class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char c1 = my_string.charAt(num1);
        char c2 = my_string.charAt(num2);
        for(int i = 0; i < num1; i++) {
            answer += my_string.charAt(i);
        }
        answer += c2;
        for(int i = num1 + 1; i < num2; i++) {
            answer += my_string.charAt(i);
        }
        answer += c1;
        for(int i = num2 + 1; i < my_string.length(); i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}