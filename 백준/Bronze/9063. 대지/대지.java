import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        List <int[]>list = new ArrayList<>();
        
        for(int i=0;i<T;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	int arr[] = {x,y};
        	
        	list.add(arr);
        }
    	   int xmax = list.get(0)[0];
    	   int xmin = list.get(0)[0];
    	   int ymax = list.get(0)[1];
    	   int ymin = list.get(0)[1];
    	   for(int j=1;j<list.size();j++) {
    		   if(xmax < list.get(j)[0]) 
    			   xmax = list.get(j)[0];
    		   if(ymax < list.get(j)[1])
    			   ymax = list.get(j)[1];
    		   if(xmin > list.get(j)[0])
    			   xmin = list.get(j)[0];
    		   if(ymin > list.get(j)[1])
    			   ymin = list.get(j)[1];
    	   }
    	   int width = (xmax-xmin)*(ymax-ymin);
    	   System.out.println(width);
    }
}

