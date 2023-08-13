import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap <String, Integer>map = new HashMap<>();
        for (int i = 0; i< name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        for (int j = 0; j < photo.length ; j++) {
            for (int i = 0; i < photo[j].length ; i++) {
                answer[j] += map.getOrDefault(photo[j][i],0);
            }
        }
        return answer;
    }
}