import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       	String str = br.readLine();
       	int size = str.length();
       	Map <String,Integer> map = new HashMap<>();
        
       for(int i=0;i<size;i++) {
    	   String tmp = str;
    	   for(int j=0;j<size-i;j++) {
    		   map.put(tmp.substring(j,j+i+1), 0);
    	   }
       }
        System.out.println(map.size());
    }
}

