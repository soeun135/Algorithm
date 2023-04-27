import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
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
		
		int T = Integer.parseInt(br.readLine()); //테스트 케이스
		
		StringBuilder sb ;
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			int num = Integer.parseInt(br.readLine());
			
			StringTokenizer st= new StringTokenizer(br.readLine());
			int arr[] = new int[num];
			for(int j=0;j<num;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			System.out.print("#"+i+" ");
			for(int k=0;k<num;k++)
		System.out.print(arr[k]+" ");
            			System.out.println(" ");

		}//하나의 테스트 케이스마다 반복문 끝
	}
}