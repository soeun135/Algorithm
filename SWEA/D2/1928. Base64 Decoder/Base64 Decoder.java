import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine()); //테스트 케이스
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			sb.append("#"+i+" ");
			String str = br.readLine();
			List <Integer>arr = new ArrayList<>(); 
			List <Integer>list = new ArrayList<>(); 

			for(int j=0;j<str.length();j++) { //인코딩 문자열 Base 64 변환
				char c = str.charAt(j);
				
				if(c >='A' && c<='Z') {
					arr.add(arr.size(),c-65);
				}
				else if(c>= 'a' && c<='z') {
					arr.add(arr.size(),c-71);
				}
				else {
					if( c>= '0' && c<= '9') {
						arr.add(arr.size(),c+4);
					}
					else if (c =='+') arr.add(arr.size(),62);
					else arr.add(arr.size(),63);
				}				
			}
			//2진수 6비트씩 저장
			int n=0;
			for(int m=0;m<arr.size();m++) {
				int ch =0;
				while(arr.get(m)/2 >1) {
					list.add(0+n,arr.get(m)%2);
					arr.set(m,arr.get(m)/2);
					ch++;
				}
				list.add(0+n,arr.get(m)%2);
				list.add(0+n,arr.get(m)/2);
				ch+=2;
				while(ch !=6) {
					list.add(0+n,0);
					ch++;
				}
				n+=6;
			}
			//8자리씩 끊어서 아스키 코드표로 변환
			for(int j=0;j<list.size()/8;j++) {
				int num = 0;
				int ch =0;
				while(ch != 8) {
					num += (int)(list.get((j*8)+ch)*Math.pow(2, 7-ch));
					ch++;
				}
				sb.append((char)num);
			}sb.append("\n");
		}//하나의 테스트 케이스 끝 
		System.out.println(sb);
	}
}