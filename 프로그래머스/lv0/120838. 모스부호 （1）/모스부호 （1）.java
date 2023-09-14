import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-:a","-...:b","-.-.:c","-..:d",".:e","..-.:f","--.:g","....:h","..:i",".---:j","-.-:k",".-..:l","--:m","-.:n","---:o",".--.:p","--.-:q",".-.:r","...:s","-:t","..-:u","...-:v",".--:w","-..-:x",
    "-.--:y","--..:z"};
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            String[] temp = morse[i].split(":");
            map.put(temp[0], temp[1]);

        }       

        StringBuilder sb = new StringBuilder();
        for (String temp : letter.split(" ")) {
            sb.append(map.get(temp));
       }
        return sb.toString(); 
    }
}