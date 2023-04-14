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
		String arr[] = new String[num];
		
	
		for(int i=0;i<num;i++) {
			arr[i] = br.readLine();
			int count = 0;
			int t = 0;
			for(int j=0;j<10;j++) { //한 문자열을 돌면서 같은 애가 몇 번째에 나오는지 체크
				
				String tmp = arr[i].substring(0,j+2);
				String tmp1=arr[i].substring(j+2, j+4+t);
				t++;
				if(tmp.equals(tmp1)) {
					count = tmp.length();
					break;
				}
			}
			System.out.println("#"+(i+1)+" "+count);
		}
	}
}