import java.util.*;

class Solution {
     public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        ArrayList <String> result = new ArrayList<>();
        for (String str : quiz) {
            String arr[] = new String[5];
            int idx = 0;
            for (String s : str.split(" ")) {
                arr[idx++] = s;
            }

            int a = Integer.parseInt(arr[0]);
            char op = arr[1].charAt(0);
            int b = Integer.parseInt(arr[2]);
            int c = Integer.parseInt(arr[4]);
            switch (op) {
                case '+':
                    if (a + b == c)result.add("O");
                    else result.add("X");
                    break;
                case '-':
                    if (a - b == c)result.add("O");
                    else result.add("X");
                    break;
            }
        }
        return result.stream().map(x->x).toArray(String[]::new);
    }
}