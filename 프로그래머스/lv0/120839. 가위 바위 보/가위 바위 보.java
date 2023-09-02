class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            int x = Character.getNumericValue(rsp.charAt(i));
            
            if (x == 2) {
                answer += 0;
            } else if (x == 0) {
                answer += 5;
            } else {
                answer += 2;
            }
        }
        return answer;
    }
}