class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            String temp = myString.substring(0, myString.length()-i);
            if (temp.endsWith(pat)) {
                return temp;
            }
        }
        return answer;
    }
}