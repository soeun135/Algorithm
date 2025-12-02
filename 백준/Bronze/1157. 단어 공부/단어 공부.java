import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] countArr = new int[26];
        int maxVal = -1;
        char answer = '?';
        int maxCnt = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c))
                c = Character.toUpperCase(c);

            countArr[c - 'A']++;

            if (maxVal < countArr[c - 'A'])
                maxVal = countArr[c - 'A'];
        }
        for (int i = 0; i < countArr.length; i++) {

            if (countArr[i] == maxVal) {
                maxCnt++;
                answer = (char) ('A' + i);
            }
        }
        if (maxCnt > 1) answer = '?';
        
        System.out.println(answer);
    }
}