class Solution {
     public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        String num = Long.toString(n);

        sb.append(num);
        sb.reverse();
        char[] arr = sb.toString().toCharArray();
        int[] answer = new int[num.length()];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i] - '0';
        }
        return answer;
    }
}