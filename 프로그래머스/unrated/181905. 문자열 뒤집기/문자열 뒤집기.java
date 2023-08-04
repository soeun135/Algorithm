class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        String answer = my_string.substring(0,s);
        sb.append(my_string.substring(s,e + 1));
        answer += sb.reverse().toString();
        answer += my_string.substring(e + 1);
        return answer;
    }
}