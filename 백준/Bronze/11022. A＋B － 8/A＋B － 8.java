import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // StringTokenizer st = new StringTokenizer(br.readLine());
       
       int num = Integer.parseInt(br.readLine());
      
       for(int i=1;i<=num;i++) {
    	   StringTokenizer st = new StringTokenizer(br.readLine());
    	   int num1 = Integer.parseInt(st.nextToken());
    	   int num2 = Integer.parseInt(st.nextToken());
    	   
    	   System.out.println("Case"+" "+"#"+i+":"+" "+num1+" "+"+"+" "+num2+" "+"="+" "+(num1+num2));
       }
      
    }
}