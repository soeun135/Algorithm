import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(br.readLine());
        int minuets = y+z;
        int hours = 0;
       if(minuets % 60 >= 0) { //분이 60을 넘어갈 때
    	   x = x+(minuets/60);
    	   if(x>=24) {
    		   hours = x-24;
        	   System.out.println(hours+" "+(minuets-60*(minuets/60)));
    	   }
    	   else
    	   System.out.println(x+" "+(minuets-60*(minuets/60)));
    	   
    	  
       }
       else //아닐 때
    	   System.out.println(x+" "+minuets);
       
       
    }
}