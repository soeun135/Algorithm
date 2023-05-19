import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


class Main{
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		int sorted[] = new int[N];
		StringBuilder sb = new StringBuilder();
		Map <Integer,Integer> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			arr[i] = sorted[i]= Integer.parseInt(st.nextToken());
		}
		int count = 0;
		Arrays.sort(sorted);
		for(int i : sorted) {
			if(!map.containsKey(i)) {
				map.put(i, count);
				count ++;
			}
		}
		for(int i : arr) {
			sb.append(map.get(i)+" ");
		}
		System.out.println(sb);
	}
}