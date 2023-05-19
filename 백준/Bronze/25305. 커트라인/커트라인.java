import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K =  Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//삽입정렬로 구현
		for(int i=1;i<arr.length;i++) {
			int temp = 0;
			for(int j=0;j<i;j++) {
				if(arr[i] >arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}//오름차순 정렬완료
		System.out.println(arr[K-1]);
	}
}