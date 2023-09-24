class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer ;
        if (my_str.length() % n != 0) {
            answer = new String[my_str.length() / n + 1];
        } else
        answer = new String[my_str.length() / n];
        for(int i = 0; i < my_str.length() / n; i++) {
            answer[i] = my_str.substring(i * n, (i * n)+ n);
        }
        if (my_str.length() % n != 0) {
            answer[my_str.length() / n] = my_str.substring(my_str.length() / n * n );
        }
        return answer;
    }
}