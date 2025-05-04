import java.util.*;

class Solution {
    public int solution(String s) {
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length(); i++) {
            //문자열 자를 함수
            int compressed = compress(s, i);
            if (compressed < min) {
                min = compressed;
            }
        }

        return min;
    }

    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();

        for (int startIdx = 0; startIdx < source.length(); startIdx += length) {
            int endIdx = startIdx + length;
            if (endIdx > source.length()) endIdx = source.length();
            tokens.add(source.substring(startIdx, endIdx));
        }
        return tokens;
    }

    private int compress(String source, int length) {
        //압축한 문자열의 길이 반환
        StringBuilder sb = new StringBuilder();

        String last = "";
        int cnt = 0;
        for (String token : split(source, length)) {
            //압축 문자열 구성
            if (token.equals(last)) {
                cnt++;
            } else {
                if (cnt > 1) sb.append(cnt);
                sb.append(last);
                last = token;
                cnt = 1;
            }
        }
        if (cnt > 1) sb.append(cnt);
        sb.append(last);

        return sb.length();
    }

}