import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main{
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		//삽입정렬로 구현해보자
		for(int j=1;j<arr.length;j++) {
			int temp = 0;
			for(int i=0;i<j;i++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(sum/5);
		System.out.println(arr[2]);
	}
}