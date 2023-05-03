import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T = Integer.parseInt(br.readLine());
    	double arr[] = {0.25,0.10,0.05,0.01};
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<T;i++) {
    		double change = Integer.parseInt(br.readLine());
    		change = change*0.01;
    		for(int j=0;j<arr.length;j++) {
    			int dshare = (int)(change/arr[j]);
    			sb.append(dshare+" ");
    			change -= dshare*arr[j];
    			change = Double.parseDouble(String.format("%.2f", change));
    			//change = Math.round(change*100)/100;
    		}
    		sb.append("\n");
    	}
    	System.out.println(sb);
 	}
}