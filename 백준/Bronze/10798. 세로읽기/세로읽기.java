import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//int N = Integer.parseInt(st.nextToken());
    	//int M = Integer.parseInt(st.nextToken());
    	char arr[][] = new char[15][15];
    	//List <char[]> list = new ArrayList<>();
    	for(int i=0;i<5;i++) {
    		String str = br.readLine();
    		int ch = 0;
   
    		for(int j=0;j<str.length();j++) {
    			arr[i][j]= str.charAt(ch);
    			ch++;
    		}
    	}
    	for(int i=0;i<15;i++) {
    		for(int j=0;j<15;j++) {
    			if(arr[j][i] != 0)
    			System.out.print(arr[j][i]);
    			else continue;
    		}
    	}
 	}
}