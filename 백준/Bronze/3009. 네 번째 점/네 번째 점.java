import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List <int[]>list= new ArrayList<>();
        
        for(int i=0;i<3;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int arr[] = {A,B};
                  
            list.add(list.size(),arr);
        }
        List <Integer>y = new ArrayList<>();
        int xch = 0;
        int ych = 0;
        int xx = 0;
        int yy = 0;
        for(int i=0;i<list.size();i++) {
        	int x = list.get(i)[0];
        	for(int j= i+1;j<list.size();j++) {
        		if(x == list.get(j)[0]) {
        			y.add(list.get(i)[1]);
        			y.add(list.get(j)[1]);
        			xch = x;
        			break;
        		}
        	}
        	if(!y.isEmpty()) break;
        }
      
        for(int i=0;i<list.size();i++) {
        	if(xch != list.get(i)[0]) { 
        		xx = list.get(i)[0];
        		ych = list.get(i)[1];
        		for(int j=0;j<y.size();j++) {
        			if(!y.get(j).equals(ych)) {
        				yy = y.get(j);
        			}
        		}
        	}
        }
        System.out.print(xx+" "+yy);
    }
}

