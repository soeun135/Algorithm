import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Solution
{
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("C:\\so_Project\\workspace\\BaekJoon\\src\\algorithm\\input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=T;i++) { //테스트케이스만큼 반복
			double sum = 0;
			int max = 0;
			int min = 10000;
			int arr[] = new int[10];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if(max < arr[j])
					max = arr[j];
				if(min > arr[j])
					min = arr[j];
			}
			for(int j=0;j<10;j++) {
				if(arr[j] != max && arr[j] != min)
					sum+= arr[j];
			}
			int avg = (int)Math.round(sum/8);
			System.out.println("#"+i+" "+avg);
		}
	}
}