import java.io.*;
import java.util.*;

public class Main {
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] charArr = new int[26];
        
        String s1 = br.readLine();
        String s2 = br.readLine();
        int answer = 0;
        
        for (char c : s1.toCharArray()) {
            charArr[c - 97]++;
        }   
        for (char c : s2.toCharArray()) {
            charArr[c - 97]--;
        }
        
        for (int i = 0; i < 26; i++) {
            answer += Math.abs(charArr[i]);
        }
        System.out.println(answer);
        br.close();
    }
}