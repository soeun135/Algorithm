import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int[][] solution(int[][] arr) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = arr.length;
        int t = arr[0].length;
        if (n > t) { //행의 수가 더 많으면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가
            for (int i = 0; i < arr.length; i++) {
                List<Integer> temp = Arrays.stream(arr[i]).boxed().collect(Collectors.toList());
                while (n != temp.size())
                    temp.add(0);
                list.add((ArrayList<Integer>) temp);
            }
        } else if (n < t){ //열의 수가 더 많으면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가
            for (int i = 0; i < arr.length; i++) {
                List<Integer> temp = Arrays.stream(arr[i]).boxed().collect(Collectors.toList());
                list.add((ArrayList<Integer>) temp);
            }
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < t; i++) {
                temp.add(0);
            }
            while (t != list.size()) {
                list.add((ArrayList<Integer>) temp);
            }
        } else {
            return arr;
        }
        int[][] answer = new int[list.size()][list.get(0).size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).stream().mapToInt(x->x).toArray();
            System.out.println(Arrays.toString(answer[i]));
        }
        return answer;
    }
}