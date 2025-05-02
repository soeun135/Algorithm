class Solution {
     public String solution(String s) {

        StringBuilder sb = new StringBuilder();
        boolean toUpper = true;

        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                //공백처리
                sb.append(c);
                toUpper = true;
            } else {
                //알파벳 변환
                if (toUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return sb.toString();
    }
}