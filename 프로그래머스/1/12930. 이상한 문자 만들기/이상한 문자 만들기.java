class Solution {
     public static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        boolean toUpper = true;
        for (char c : s.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                sb.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    sb.append(Character.toUpperCase(c));
                } else sb.append(Character.toLowerCase(c));
                            toUpper = !toUpper;

            }
        }
       
        return sb.toString();
    }
}