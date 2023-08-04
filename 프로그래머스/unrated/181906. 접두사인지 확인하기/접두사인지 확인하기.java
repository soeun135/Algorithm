class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            String temp = my_string.substring(0, i+1);
            
            if (temp.equals(is_prefix)) {
                return 1;
            }
        }
        return answer;
    }
}