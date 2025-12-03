import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String doc = br.readLine();
        String word = br.readLine();
        
        int startIdx = 0;
        int answer = 0;
        
        int wordLen = word.length();
        
        while (startIdx <= doc.length() - wordLen) {
            String sub = doc.substring(startIdx, startIdx + wordLen);
            
            if (sub.equals(word)) {
                answer++;
                startIdx += wordLen;
            } else startIdx++;
        }
        
        System.out.println(answer);
        br.close();
    }
}