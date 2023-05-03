import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	int arr[][] = new int[100][100];
    	int result = num*10*10;
    	for(int i=0;i<num;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		for(int j=x;j<x+10;j++) {
    			for(int k=y;k<y+10;k++) {
    				arr[j][k] ++;
    			}
    		}
    	}
    	for(int m=0;m<100;m++) {
    		for(int n=0;n<100;n++) {
    			if(arr[m][n] >=2)
    				result -= 1*(arr[m][n]-1);
    		}
    	}
    	System.out.println(result);
 	}
}