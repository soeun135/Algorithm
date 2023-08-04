class Solution {
   public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < my_string.length()){
            String temp = my_string.substring(idx, idx + m);
            sb.append(temp.charAt(c - 1));
            idx += m;
        }
        return sb.toString();
    }
}