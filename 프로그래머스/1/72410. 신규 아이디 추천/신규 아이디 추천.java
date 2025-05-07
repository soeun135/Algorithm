class Solution {
    public static String solution(String new_id) {

        if (new_id.matches("[^.][0-9a-z\\-\\_\\.]{3,15}[^.]")) {
            return new_id;
        }

        //1 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();
        //2 허용가능 문자 제외 다 제거
        new_id = new_id.replaceAll("[^a-z0-9\\_\\-\\.]", "");
        //3 마침표 2개 이상 연속 부분 하나로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        //4 마침표로 시작 or 끝이면 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        //5 빈문자열이 돼버렸으면 a 대입
        if (new_id.equals("")) new_id = "a";
        //6 길이가 16자 이상이면 15자만 남기고 다 제거 + 맨끝 마침표면 제거
        if (new_id.length() >= 16) new_id = new_id.substring(0, 15);
        if (new_id.charAt(new_id.length() - 1) == '.') new_id = new_id.substring(0, new_id.length() - 1);
        //7 길이가 2이하이면 마지막 문자를 길이 3될때까지 반복
        StringBuilder new_idBuilder = new StringBuilder(new_id);
        while(new_idBuilder.length() <= 2) {
            char last = new_idBuilder.charAt(new_idBuilder.length() - 1);
            new_idBuilder.append(last);
        }
        new_id = new_idBuilder.toString();

        return new_id;
    }
}