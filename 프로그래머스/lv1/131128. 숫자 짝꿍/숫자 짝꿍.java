import java.util.*;

class Solution {
    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer>x = new HashMap<>();
        HashMap<Integer, Integer>y = new HashMap<>();

        for (int i = 0; i < X.length(); i++) {
            int n = Character.getNumericValue(X.charAt(i));
            x.put(n, x.getOrDefault(n, 0) + 1);
        }
        for (int i = 0; i < Y.length(); i++) {
            int n = Character.getNumericValue(Y.charAt(i));
            if (x.containsKey(n))
                y.put(n, y.getOrDefault(n, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        for (int i : x.keySet()) {
            if (y.containsKey(i)) {
                int n = (x.get(i) <= y.get(i)) ? x.get(i) : y.get(i);
                sb.append(Integer.toString(i).repeat(n));
            }
        }
        String str = sb.toString();
        for (char c : str.toCharArray()) {
            list.add(Character.getNumericValue(c));
        }
        Collections.sort(list, Collections.reverseOrder());
        if (list.isEmpty()) return "-1";
        int zerocount = 0;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) == 0) {
                zerocount++;
            }
            if (zerocount == list.size()) return "0";
            answer.append(list.get(i));
        }
        return answer.toString();
    }
}