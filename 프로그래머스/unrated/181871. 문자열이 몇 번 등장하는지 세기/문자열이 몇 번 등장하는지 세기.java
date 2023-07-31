class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            String temp = myString.substring(i, i + pat.length());
            System.out.println(temp);
            if (temp.equals(pat)){
                answer ++;
            }
        }
        return answer;
    }
}