import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=num;i++) {
			int data = Integer.parseInt(br.readLine());
			int arr[] = new int[data];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<data;j++) 
				arr[j] = Integer.parseInt(st.nextToken());
			
			long result = 0;
			int max = arr[data-1]; //맨 뒤에수를 max라고 가정.
			
			for(int k=data-2;k>=0;k--) {
				if(arr[k]>max) {
					max = arr[k]; //자기보다 큰 수 만나면 max변경
				}
				else { //자기보다 작거나 같으면
					result += (max-arr[k]);
				}
			}
			System.out.println("#"+i+" "+result);
		}
	}
}