import java.util.*;

class Solution {
    public static int solution(int[] number) {
        int answer = 0;

        Arrays.sort(number);

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length ; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
//        for (int i = 0; i < number.length - 1; i++) {
//            int p1 = i + 1;
//            int p2 = number.length - 1;
//
//            while (number[i] + number[p1] + number[p2] <= 0 && p1 < p2) {
//                if (number[i] + number[p1] + number[p2] == 0 && p1 < p2) {
//                    System.out.println(number[i] + " "+ number[p1] +" "+ number[p2]);
//                    answer++;
//                }
//                p1++;
//            }
//            while (number[i] + number[p1] + number[p2] >= 0 && p1 < p2) {
//                if (number[i] + number[p1] + number[p2] == 0 && p1 < p2) {
//                    System.out.println(number[i] + " "+ number[p1] +" "+ number[p2]);
//                    answer++;
//                }
//                p2--;
//            }
//        }
        return answer;
    }
}