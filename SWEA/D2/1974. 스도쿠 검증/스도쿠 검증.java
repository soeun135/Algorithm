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
		String arr[][] = new String[9][9];
		
		for(int i=1;i<=T;i++) { //하나의 테스트케이스마다 반복
			int result = 1;
			for(int j=0;j<9;j++) {//입력 값 배열에 저장
				StringTokenizer st  =new StringTokenizer(br.readLine());
				for(int k=0;k<9;k++) {
					arr[j][k] = st.nextToken();
				}
			}
			
			String str[] = {"1","2","3","4","5","6","7","8","9"};
			
			for(int j=0;j<str.length;j++) {
				int gcount =0;
				int scount =0;
				int squarecount =0;
				for(int k=0;k<9;k++) {
					for(int m=0;m<9;m++) {
						//가로 확인( 행은 동일)
						if(str[j].equals(arr[k][m])) {
							gcount ++;
						}
						//세로확인
						if(str[j].equals(arr[m][k])) {
							scount++;
						}
						//System.out.println("gc"+" "+gcount+"sc"+" "+scount);
					}
					if(gcount == 2 || scount==2) {
						result = 0;
						break;
					}
					else if(gcount != 2 && scount != 2) {
						gcount = 0;
						scount=0;
					}
				}
				//3*3 확인
				for(int l=0;l<8;l+=3) { //시작 점 위치
					for(int o=0;o<8;o+=3) {
						for(int k=l;k<l+3;k++) { //시작 점으로부터 3*3탐색
							for(int m=o;m<o+3;m++) {
								if(str[j].equals(arr[k][m])) {
									//System.out.println("k"+k+" "+"m"+m+" "+"arr"+" "+arr[k][m]+" "+squarecount);
									squarecount++;
							}
						}
						
					}//한 네모칸이 끝나고
						if(squarecount == 2) {
							result =0;
							break;
						}
						else squarecount=0;
				}
			}
				if(result == 0)
					break;
		}
		System.out.println("#"+i+" "+result);
		}//하나의 테스트 케이스마다 반복문 끝
	}
}