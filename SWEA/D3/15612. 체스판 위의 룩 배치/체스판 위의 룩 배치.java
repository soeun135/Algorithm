import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

		for(int i=1;i<=T;i++) {
			List <Integer> row = new ArrayList<>();
			List <Integer> col = new ArrayList<>();
			int ch = 0;

			for(int j=0;j<8;j++) {
				String str = br.readLine();
				for(int k=0;k<str.length();k++) {
					char c = str.charAt(k);
					if(c == 'O') {
						ch++;
						if(!row.contains(j) && !col.contains(k)) {
							row.add(j);
							col.add(k);
						}
						else if(row.contains(j) || col.contains(k) )
						{//값이 이미 리스트들에 존재했으면 !
							break;
						}
					}
				}
			} //한 줄 씩 8줄 반복
			if(row.size() == 8 && col.size() == 8 && ch ==8) {
				System.out.println("#"+i+" "+"yes");
			}
			else System.out.println("#"+i+" "+"no");
			
		}
	}
}