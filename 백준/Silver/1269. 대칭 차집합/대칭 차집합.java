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
        Map <Integer,Integer> map = new HashMap<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
        	map.put(Integer.parseInt(st.nextToken()), 0);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
        	int num = Integer.parseInt(st.nextToken());
        	if(map.containsKey(num)) {
        		map.remove(num);
        	}
        	else map.put(num, 0);
        }
        sb.append(map.size());
        System.out.println(sb);
    }
}

