class Solution {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int arr[] = new int[n];
        for (int i = 0; i < section.length; i++) {
            arr[section[i] - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                for (int j = i; j < i + m && j < arr.length; j++) {
                    arr[j] = 0;
                }
                answer++;
            }
        }
        return answer;
    }
}