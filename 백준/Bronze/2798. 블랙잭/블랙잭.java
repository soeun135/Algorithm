import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int key = Integer.parseInt(st.nextToken());
		int sum = 0;
		int arr[] = new int[num];
		List <Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int m=1;
		int k=0;
		while(m != arr.length-1) {
			int max = arr[arr.length-m];//제일 큰 수

			for(int i=m+1;i<arr.length;i++) {
				sum = max + arr[arr.length-i];
				
				if(sum >= key) {//제일 큰 수 두 개를 잡았을 때 key값과 같거나 넘어버리면
					continue;
				}
				else { //큰 수 두 개를 잡았을 때 key값보다 작으면
					k=0;
					while(sum+arr[k] <= key && arr[arr.length-i] != arr[k]) { //제일 작은 수부터 구해봄
						list.add(sum+arr[k]);
						k++; //제일 작은 수를 증가시켜봄
					}
				}
			}
			m++; //제일 큰 수를 그 다음 번 째 큰 수로 조정
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(0));
	}
}