class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0,s));
        sb.append(overwrite_string);
        sb.append(my_string.substring(s+overwrite_string.length()));
        answer = sb.toString();
        return answer;
    }
}