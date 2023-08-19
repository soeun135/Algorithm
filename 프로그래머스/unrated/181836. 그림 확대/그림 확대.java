class Solution {
    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        for (int i = 0; i < picture.length; i++) {
            String temp = "";
            for (int j = 0; j < picture[i].length() ; j++) {
                char c = picture[i].charAt(j);
                temp += c;
                for (int l = 0; l < k - 1; l++) {
                    temp += c;
                }
            }
            answer[idx] = temp;
            for (int j = 1; j < k; j++) {
                answer[idx + j] = temp;
            }
            idx+=k;
        }
        return answer;
    }
}