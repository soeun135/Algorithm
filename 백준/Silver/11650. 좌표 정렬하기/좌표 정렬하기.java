import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int co[][] = new int[num][2];
		
		StringTokenizer st;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			co[i][0] = Integer.parseInt(st.nextToken());
			co[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(co,(o1,o2)-> {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];
				}
				return o1[0]-o2[0];
		});
        
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++)
			sb.append(co[i][0]+" "+co[i][1]).append(" ");
		
		System.out.println(sb);
	}
	
}
