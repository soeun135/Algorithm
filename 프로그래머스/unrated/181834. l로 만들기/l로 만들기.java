class Solution {
    public static String solution(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c < 'l') {
                myString = myString.replace(String.valueOf(c), "l");
            }
        }
        return myString;
    }
}