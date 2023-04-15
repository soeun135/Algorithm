import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      // StringTokenizer st = new StringTokenizer(br.readLine());
       
       int result = Integer.parseInt(br.readLine()); //총금액
       int count = Integer.parseInt(br.readLine()); 
       int sum = 0;
       for(int i=0;i<count;i++) {
    	   StringTokenizer st = new StringTokenizer(br.readLine());
    	   int num1 = Integer.parseInt(st.nextToken());
    	   int num2 = Integer.parseInt(st.nextToken());
    	   
    	   sum += num1*num2;
    	  
       } 
       if(sum == result) bw.write("Yes");
       else bw.write("No");
       bw.flush();
     bw.close();
    }
}