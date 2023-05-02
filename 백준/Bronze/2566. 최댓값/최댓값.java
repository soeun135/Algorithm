import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//int N = Integer.parseInt(st.nextToken());
    	//int M = Integer.parseInt(st.nextToken());
    	//int arr[][] = new int[N][M];
    	int max=-1;
    	int arr[] = new int[2];
    	for(int i=0;i<9;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0;j<9;j++) {
    			int num = Integer.parseInt(st.nextToken());
    			if(max < num) {
    				max = num;
    				arr[0] = i+1; arr[1] = j+1;
    			}
    		}
    	}
    	System.out.println(max);
    	System.out.print(arr[0]+" "+arr[1]);
 	}
}