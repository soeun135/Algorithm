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
		List <Character> list = new ArrayList<>();
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			int num = Integer.parseInt(br.readLine());
			for(int j=0;j<num;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				char c = st.nextToken().charAt(0);
				int a = Integer.parseInt(st.nextToken());
				
				for(int k=0;k<a;k++) {
					list.add(c);
				}
			}
			bw.write("#"+i+"\n");
			int ch = 0;
			while(list.size()>0) {
					bw.write(list.get(0));
					list.remove(0);
					ch ++;
				if(ch == 10) {
					bw.write("\n");
					ch=0;
				}
					
			}
			bw.write("\n");
		}//하나의 테스트 케이스마다 반복문 끝
		bw.flush();
		bw.close();
	}
}