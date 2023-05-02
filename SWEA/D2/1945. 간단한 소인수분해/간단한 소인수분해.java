import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); //테스트 케이스
		
		int arr[]= {11,7,5,3,2};
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			int num = Integer.parseInt(br.readLine());
			List <Integer>list = new ArrayList<>();
			for(int j=0;j<arr.length;j++) {
				int ch = 0 ;
				int dshare = num%arr[j];
				while(dshare == 0) {
					num = num/arr[j];
					ch ++;
					dshare = num%arr[j];
				}
				list.add(0,ch);
			}
			bw.write("#"+i+" ");
			for(int k=0;k<list.size();k++) {
				bw.write(list.get(k)+" ");
			}
			bw.write("\n");
		}//하나의 테스트 케이스 끝
		bw.flush();
		bw.close();
	}
}