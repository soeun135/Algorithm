import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int []arr = new int[num]; 
		
		int val = 0;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int num1 = Integer.parseInt(br.readLine());
		int []arr1 = new int[num1];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<num1;i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); //10의 자리 구분 못 함

		int j=0;
		//이진탐색 인덱스(mid,high,low)로 탐색 !!!!!!!!
		for(int k=0;k<num1;k++) {
			int high = num-1;
			int low = 0;
			
			while(low<=high) {
				int mid = (low+high) /2;
				val = 0;
				if(arr1[j] == arr[mid]) {
					sb.append(1+"\n");
					val=1;
					j++;
					break;
				}
				else if(arr1[j] > arr[mid])//key>mid
					low = mid+1;
				else //key>mid
					high = mid-1;
			}
			if(val ==0) {
				sb.append(0+"\n");
				j++;
			}
		}
		System.out.print(sb);
	}
}