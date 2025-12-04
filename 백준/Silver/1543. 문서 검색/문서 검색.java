import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String doc = br.readLine();
        String word = br.readLine();

        int docLen = doc.length();

        if (doc.length() >= word.length()) {
            doc = doc.replace(word, "");
        }

        System.out.println((docLen - doc.length()) / word.length());
        br.close();
    }
}