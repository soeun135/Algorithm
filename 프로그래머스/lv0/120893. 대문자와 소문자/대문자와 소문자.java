class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length() ;i++){
            char c = my_string.charAt(i);
            if(c >= 'a' && c <= 'z') {
                answer += (char)(c - 32);
            }
            else {
                answer += (char)(c + 32);
            }
        }
        return answer;
    }
}