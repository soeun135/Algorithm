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
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List <Integer>list = new ArrayList<>();;
		for(int m =0;m<N;m++) {
			list.add(m+1);
		}
		for(int m=0;m<M;m++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int x=i-1;x<k-1;x++) {
				list.add(j-1,list.remove(i-1));
			}
		}
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}
}