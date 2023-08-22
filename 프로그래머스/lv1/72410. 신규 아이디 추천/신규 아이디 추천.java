import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
     public static String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        //1
        new_id = new_id.toLowerCase();

        //2
        Pattern newPattern = Pattern.compile("[\\w\\.\\-\\_]*");
        Matcher newMatcher = newPattern.matcher(new_id);
        while (newMatcher.find()) {
            answer += newMatcher.group();
        }

        //3
        while (answer.contains("..")) {
            answer = answer.replace("..",".");
        }
        sb.append(answer);

        //4
        if (sb.charAt(0) == '.' || sb.charAt(sb.length() - 1) == '.') {
            if (sb.charAt(0) == '.') {
                sb.deleteCharAt(0);
            }
            if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        //5
        if (sb.length() == 0) {
            sb.append("a");
        } //6
        else if (sb.length() >= 16) {
            sb.delete(15, sb.length());
        }

        while (sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        while (sb.length() < 3) {
            sb.append(sb.charAt(sb.length() - 1));
        }
        return sb.toString();
    }
}