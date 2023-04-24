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
    	
    	String str = br.readLine(); //입력을 읽어들임
    	int result =0;
    	char [][]arr = { {' '},{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'},{'M','N','O'},{'P','Q','R','S'},{'T','U','V'},{'W','X','Y','Z'}};
    	for(int i=0;i<str.length();i++) {
    		char c = str.charAt(i);
    		
    		for(int j=0;j<arr.length;j++) { //arr.length -> 행의갯수 9개
    			for(int k=0;k<arr[j].length;k++) {
    				if(c == arr[j][k]) {
    					result += (j+2);
    				}
    			}
    		}
    	}    	
		System.out.println(result);

	}
}