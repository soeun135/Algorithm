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
		int arr[] = {50000,10000,5000,1000,500,100,50,10};
		StringBuilder sb ;
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			sb = new StringBuilder();
			int change =  Integer.parseInt(br.readLine());
			
			for(int j=0;j<arr.length;j++) {
				if(change/arr[j] != 0) {
					sb.append(change/arr[j]+" ");
					change = change%arr[j];
				}
				else {
					sb.append(0+" ");
					continue;
				}
			}
		System.out.println("#"+i);
		System.out.println(sb);
		}//하나의 테스트 케이스마다 반복문 끝
	}
}