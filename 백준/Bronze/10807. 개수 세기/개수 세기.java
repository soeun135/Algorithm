import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    	
    	int N = Integer.parseInt(br.readLine());//N개의 정수
    	
    	int arr[] = new int[N];

    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0;i<N;i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	int M = Integer.parseInt(br.readLine());
    	int count = 0;
    	for(int i =0;i<arr.length;i++) {
    		if(M == arr[i]) 
    			count++;
    	}
    		
    	System.out.print(count);
    }
}