class Solution {
    public String[] solution(String[] names) {
        int cnt = 0;
        if (names.length % 5 == 0) {
            cnt = names.length/5;
        } else {
            cnt = names.length/5 + 1;
        }
        String[] answer = new String[cnt];
        int idx  = 0;
        for (int i = 0; i < cnt; i++) {
            answer[i] = names[idx];
            idx += 5;
        }
        return answer;
    }
}