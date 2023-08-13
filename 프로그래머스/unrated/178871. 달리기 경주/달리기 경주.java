import java.util.*;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap <String, Integer>map = new HashMap<>();
        String []play = new String[players.length];
        for (int i = 0 ; i < players.length ; i++) {
            play[i] = players[i];

            map.put(players[i], i + 1);
        }
        for (int i = 0; i < callings.length ; i++) {
            String s = callings[i];
            int idx = map.get(s) - 1;
            map.replace(s, idx);
            map.replace(play[idx - 1], idx + 1);
            play[idx] = play[idx - 1];
            play[idx - 1] = s;
        }
        for (Map.Entry<String, Integer>item : map.entrySet()) {
            answer[item.getValue() - 1] = item.getKey();
        }
        return answer;
    }
}