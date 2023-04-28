import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int num = Integer.parseInt(br.readLine());
    	
    	int result = 0;
    	for(int i=0;i<num;i++) {
    		String str = br.readLine();
    		String alpa= "abcdefghijklmnopqrstuvwxyz";
    		int ch = 1;
    		if(str.length() == 1) {
    			result ++;
    			continue;
    		}
    		for(int j=0;j<str.length();j++) {
    			char c = str.charAt(j); //문자열을 한글자씩 찢음

   				String smj = Character.toString(c);
   				if(alpa.contains(smj)) {
   					if(j < str.length()-1)
   					if(c != str.charAt(j+1)) {
       					alpa = alpa.replace(smj, "!");
       					//System.out.println(alpa);
   					}
   					else {
   						continue;
   					}
   				}
   				else {
   					ch=0;
   					break;
   				}	
   			}
   			if(ch==1) {
   				//System.out.println(alpa);
   				result++;
   			}
    	}
    	System.out.println(result);
	}
}