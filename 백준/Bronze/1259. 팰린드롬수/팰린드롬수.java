import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List <String>num = new ArrayList<>();
		int count =0;
		int i=0;
		
		while(true) {
			String input = br.readLine();
			if( !input.equals("0")) {
				num.add(i,input);
				i++;
			}else break;	
		}
		for(int k =0;k<num.size();k++) {
			count=0;
			String str = num.get(k);
			int size = str.length();
			
			for(int j=0;j<size/2;j++) {
				if(str.charAt(j) == str.charAt(str.length()-(j+1)))
					count++;
			}
			if(count == size/2)
				System.out.println("yes");
			else System.out.println("no");
		}
	}
}