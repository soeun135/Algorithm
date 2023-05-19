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

        int T = Integer.parseInt(br.readLine());
        
        
        Map <String,Integer>list = new HashMap<>();
        String N = " ";
        for(int i=0;i<T;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	N = st.nextToken();
        	String M = st.nextToken();
        
        	if(M.equals("enter")) 
        		list.put(N,0);
        	else list.remove(N);
        }
        List <String> arr = new ArrayList<>();
        for(String c : list.keySet()) {
        	arr.add(c);
        }
        	
        Collections.sort(arr);
        for(int i=list.size()-1;i>=0;i--) {
        	System.out.println(arr.get(i)); 
        }
           
    }
}

