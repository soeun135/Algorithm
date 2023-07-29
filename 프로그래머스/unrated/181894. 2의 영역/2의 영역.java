import java.util.*;

class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        List <Integer>twoIdx = new ArrayList<>();
        List <Integer> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                twoIdx.add(i);
            }
        }
        if (twoIdx.size() == 1) {
            result.add(2);
        } else if (twoIdx.size() == 2) {
            for (int i = twoIdx.get(0); i <= twoIdx.get(1); i++) {
                result.add(arr[i]);
            }
        } else if (twoIdx.size() == 0){
            result.add(-1);
        } else {
            for (int i = twoIdx.get(0); i <= twoIdx.get(twoIdx.size()-1); i++) {
                result.add(arr[i]);
            }
        }
        answer = result.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}