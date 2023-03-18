import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int sixcount=0;
		List <Integer>collectsix= new ArrayList<>();
		char c=' ';
		int i=0;

		while(true) {
			sixcount=0;
			String str = Integer.toString(i);
			i++;
			for(int j=0;j<str.length();j++) {
				c = str.charAt(j);
				
				if(c=='6') {
					sixcount++;
					if(sixcount == 3) {
						collectsix.add(Integer.parseInt(str));
						//sixcount=0;
					}
				}
				else
					sixcount = 0;
			}
			if(collectsix.size()>num)
				break;
		}
		System.out.println(collectsix.get(num-1));
	}
}