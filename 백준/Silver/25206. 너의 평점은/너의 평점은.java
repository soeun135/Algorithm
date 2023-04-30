import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	
    	String arr[] = {"F","D0","D+","C0","C+","B0","B+","A0","A+"};
    	double sum = 0;
    	
    	double count=0;
    	for(int i=0;i<20;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String subject = st.nextToken();
    		double score = Double.parseDouble(st.nextToken());
    		String grade = st.nextToken();
    		
    		int j=0;
    		for(j=0;j<9;j++) {
    			if(arr[j].equals(grade))
    				break;
    		}
    		if(grade.equals("P")) continue;
    		else if(grade.equals("F")) {
    			count += score;
    			continue;
    		}
    		sum+= (score*(j*0.5+0.5));
    		count += score;
    		//System.out.println(sum);
    	}
    	System.out.println(sum/count);
	}
}