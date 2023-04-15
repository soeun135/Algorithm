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
       
       int num = Integer.parseInt(br.readLine());
      
       for(int i=1;i*4<=num;i++) {
    	   //StringTokenizer st = new StringTokenizer(br.readLine());
    	  // int num1 = Integer.parseInt(st.nextToken());
    	  // int num2 = Integer.parseInt(st.nextToken());
    	   bw.write("long"+" ");
    	  
       } bw.write("int"+"\n");
       bw.flush();
     bw.close();
    }
}