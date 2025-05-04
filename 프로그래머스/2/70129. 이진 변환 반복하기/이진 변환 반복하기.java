class Solution {
    public int[] solution(String x) {
        int[] answer = new int[2];

        while (!x.equals("1")) {
            answer[0] ++;
            int length = x.length();

            int remove_length = x.replace("0", "").length();
            answer[1] = answer[1] + length - remove_length;

            x = Integer.toString(remove_length, 2);
        }
        return answer;
    }
}