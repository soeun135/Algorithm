import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()); // 이미 갖고 있는 랜선의 갯수
		int n = Integer.parseInt(st.nextToken()); // 필요한 랜선의 갯수
		int arr[] = new int[k]; //갖고있는 랜선의 길이값을 저장할 배열

		for(int i=0;i<k;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}//전선의 길이를 배열에 저장
		
		Arrays.sort(arr);
		int count =0;
		long high = arr[k-1];
		long mid = 0;
		long low = 1;
		int max = 0;
		while(low <= high) {
			count = 0;
			mid = (high+low)/2;
			for(int i=0;i<arr.length;i++) 
				count += arr[i] / mid ;
			if(count < n)
				high = mid -1;
			else if(count >=n) {
				low = mid + 1;
			}
		}
		System.out.println(high);
	}
}