class Solution {
    public static long solution(String numbers) {

        String[][] arr = {{"zero","0"},{"one","1"},{"two","2"},{"three","3"},{ "four","4"},{ "five","5" },{"six","6" },{"seven", "7"},{"eight","8"},{"nine","9"}};
        for(int i = 0; i < arr.length; i++) {
            numbers = numbers.replaceAll(arr[i][0], arr[i][1]);
        }
        return Long.parseLong(numbers);
    }
}