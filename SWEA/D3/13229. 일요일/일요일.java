import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


class Solution{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		String day[] = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		
		for(int i=1;i<=T;i++) {
			String str = br.readLine();
			int count = 0;
			int j =0;
			for(j=0;j<day.length;j++) {
				if(day[j].equals(str)) {
					break;
				}
			}
			if(str.equals("SUN")) count = 7;
			else {
				for(int k=j;k<day.length;k++) {
					if(!day[k].equals("SUN")) {
						count++;
					}
				}
			}
			System.out.println("#"+i+" "+count);
		}
	}
}