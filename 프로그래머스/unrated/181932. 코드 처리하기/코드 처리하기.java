class Solution {
    public static String solution(String code) {
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (mode == 0) {
                if (c != '1') {
                    if (i % 2 == 0)
                        sb.append(c);
                } else {
                    mode = 1;
                }
            } else { //mode == 1
                if (c != '1') {
                    if (i % 2 != 0)
                        sb.append(c);
                } else {
                    mode = 0;
                }
            }
        }
        if (sb.toString().equals("")) {
            return "EMPTY";
        }
        return sb.toString();
    }
}