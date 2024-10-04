class Solution {
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }

        return sb.toString();
    }

    private static char push(char c, int n) {
        //c를 n만큼 밀어 반환
        if (c == ' ') {
            return c;
        } else {
            int offset = Character.isUpperCase(c) ? 'A' : 'a';
            int position = c - offset;

            position = (char) ((position + n) % 26);
            return (char) (offset + position);
        }
    }
}