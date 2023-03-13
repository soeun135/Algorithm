import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int input[][] = new int[num][3];
		int count=0;
		StringBuilder sb= new StringBuilder();
		int h=0;
		int w=0;
		int n=0;
		String result[] = new String[num];
		int search = 0;
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[i][0] = Integer.parseInt(st.nextToken());
			input[i][1] = Integer.parseInt(st.nextToken());
			input[i][2] = Integer.parseInt(st.nextToken());
		}
		for(int k=0;k<num;k++) {
			h=input[k][0] ;
			w=input[k][1];
			n=input[k][2];

			for(int i=1;i<=w;i++) {
				for(int j=1;j<=h;j++) {
					count++;
					if(count == n) {
						if(i<10) 
							result[k] = j+"0"+i;
						else
						result[k] = j+""+i;
			
						search=1;
						count=0;
						break;
					}
				}
				if(search == 1) {
					sb.append(result[k]).append("\n");
					search=0;
					break;
				}
			}		
		}
		System.out.println(sb);
	}
}