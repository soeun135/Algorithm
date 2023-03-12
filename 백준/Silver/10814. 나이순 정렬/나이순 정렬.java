import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String arr[][] = new String[num][2];
		
		StringTokenizer st;
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		Arrays.sort(arr,(o1,o2)->{
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
