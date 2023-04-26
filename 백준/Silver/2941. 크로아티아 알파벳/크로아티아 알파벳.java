import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	String str = br.readLine();
    	String arr[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
    	
    	int count =0;
   
    	while(str.length() >0){
    		boolean ch = false;
    		String alpha ="";
    		String beta = "";
    		if(str.length()>=2)
    			alpha = str.substring(0,2);
    		if(str.length()>=3)
    			beta = str.substring(0,3);
    		for(int j=0;j<arr.length;j++) {
    			if(alpha.equals(arr[j])) {
    				count++;
    				str = str.substring(2);
    				ch=true;
    			}
    			else if(beta.equals(arr[j])) {
    				count++;
    				str = str.substring(3);
    				ch=true;
    			}
    		}
    			if(ch == false) { //배열에 저장된 크로아티아 알파벳이 아니라면
    				count++;
    				str = str.substring(1);
    			}
    	}
    	System.out.println(count);
	}
}