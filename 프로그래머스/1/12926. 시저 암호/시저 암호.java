class Solution {
   public String solution(String s, int n) {
        char[] arr = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            //알파멧 밀기
            sb.append(push(c, n));
        }

        return sb.toString();
    }

    public char push (char c, int n) {
        if (!Character.isAlphabetic(c)) return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a'; //offset 설정
        int position = c - offset;

        position = (position + n) % ('Z' - 'A' + 1);

        return (char) (offset + position);
    }
}