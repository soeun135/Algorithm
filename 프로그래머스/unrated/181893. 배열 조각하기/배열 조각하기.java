import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList<>();
        IntStream.of(arr).forEach(list::add);
        for (int i = 0; i < query.length ; i++) {
            if (i % 2 == 0) {
                for (int j = list.size() - 1 ; j > query[i]; j--) {
                    list.remove(j);

                }
            } else {
                for (int j = 0 ; j < query[i]; j++) {
                    list.remove(0);

                }
            }
        }
        answer = list.stream().mapToInt(x->x).toArray();
        return answer;
    }
}