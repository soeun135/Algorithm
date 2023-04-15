import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());//바구니의 갯수
    	int M = Integer.parseInt(st.nextToken());//바구니를 역순으로 만들 방법 
    	
    	List <Integer>list = new ArrayList<>();
    	List <Integer>temp = new ArrayList<>();

    	for(int i=1;i<=N;i++) {
    		list.add(i);
    	}
    	for(int i =0;i<M;i++) {
    		st = new StringTokenizer(br.readLine());
    		int j = Integer.parseInt(st.nextToken());
    		int k = Integer.parseInt(st.nextToken());
    		int g = 0;
    		int c = 0;
    		temp.clear();
    		
    		for(int m=j-1;m<k;m++) {
    			temp.add(g,list.get(m));
    			g++;
    		}
    		for(int f=temp.size()-1;f>0;f--) { //temp 리스트에서 범위 숫자 역순 정렬
    			temp.add(c,temp.get(temp.size()-1));
    			temp.remove(temp.size()-1);
    			c++;
    		}
    		for(int n = 0;n<temp.size();n++) 
    			list.set((j-1+n),temp.get(n));
    	}
    	for(int i=0;i<list.size();i++) 
    		System.out.print(list.get(i)+" ");
    }
}