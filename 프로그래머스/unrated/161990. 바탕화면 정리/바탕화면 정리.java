import java.util.*;

class Solution {
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length ; i++) {
            for (int j = 0; j < wallpaper[0].length() ; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    top = Math.min(i, top);
                    left = Math.min(j, left);
                    bottom = Math.max(i, bottom);
                    right = Math.max(j, right);
                }
            }
        }
        answer[0] = top;
        answer[1] = left;
        answer[2] = bottom + 1;
        answer[3] = right + 1;
        return answer;
    }
}