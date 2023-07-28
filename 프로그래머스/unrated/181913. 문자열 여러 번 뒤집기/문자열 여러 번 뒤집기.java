class Solution {
     public static String solution(String my_string, int[][] queries) {
        String answer = "";
        for (int[] x : queries) {
            String temp = "";
            for (int i = x[1]; i >= x[0]; i--) {
                temp += my_string.charAt(i);
            }
            my_string = my_string.substring(0,x[0]) + temp + my_string.substring(x[1] + 1);
        }
        return my_string;
    }
}