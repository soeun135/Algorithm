import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map <String,Integer> lmap = new HashMap<>();
        List <String> key = new ArrayList<>();
        for(int i=0;i<N;i++) {
        	String str = br.readLine();
        	lmap.put(str,1);
        }
       for(int i=0;i<M;i++) {
    	   String str = br.readLine();
    	   if(lmap.containsKey(str))
    		   key.add(str);
    		  // lmap.put(str,lmap.getOrDefault(str,1)+1);
       }
       sb.append(key.size()+"\n");
       Collections.sort(key);
       for(String s : key) {
    	   sb.append(s+"\n");
       }
        System.out.println(sb);
    }
}

