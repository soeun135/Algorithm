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
		
		StringTokenizer st ;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			co[i][0] = Integer.parseInt(st.nextToken());
			co[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(co,(a1,a2) -> {
				if(a1[1] == a2[1]) {
					return a1[0]-a2[0]; 
				}
			return a1[1]-a2[1];
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++) {
			sb.append(co[i][0]+" "+co[i][1]).append("\n");
		}
		System.out.println(sb);
	}
	
}
