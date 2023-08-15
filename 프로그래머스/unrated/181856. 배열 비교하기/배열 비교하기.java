import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            if (Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()) {
                return 0;
            }
            return Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : -1;
        }
    }
}