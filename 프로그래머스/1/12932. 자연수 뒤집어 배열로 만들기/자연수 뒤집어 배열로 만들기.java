class Solution {
    public int[] solution(long n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        String str = stringBuilder.reverse().toString();

        char[] cArr = str.toCharArray();
        int[] answer = new int[stringBuilder.length()];

        for (int i = 0; i < stringBuilder.length(); i++) {
            answer[i] = Character.getNumericValue(cArr[i]);
        }
        return answer;
    }
}