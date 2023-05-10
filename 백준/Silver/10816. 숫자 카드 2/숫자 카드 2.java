import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num;i++) {
        	int index = Integer.parseInt(st.nextToken());
        	map.put(index, map.getOrDefault(index,0)+1);
        }
       int M = Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine());
       StringBuilder sb = new StringBuilder();
       
       for(int i=0;i<M;i++) {
    	   int n = Integer.parseInt(st.nextToken());
    	   if(map.containsKey(n)) {
    		   sb.append(map.get(n)+" ");
    	   }
    	   else sb.append(0+" ");
       }
       System.out.println(sb);
    }
}

