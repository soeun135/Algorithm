class Solution {
    public boolean solution(String s) {
        s = s.toUpperCase();

        if (s.contains("Y") || s.contains("P")) {
            String tmp = s;
            if (s.replace("Y", "").length() != tmp.replace("P", "").length()) {
                return false;
            }
        }
        return true;
    }
}