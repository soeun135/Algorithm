import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		//System.setIn(new FileInputStream("C:\\so_Project\\workspace\\BaekJoon\\src\\algorithm\\input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		String arr[] = new String[T];
		String carr[][] = new String[T][8];
		for(int test_case = 0;test_case<T;test_case++) {
				arr[test_case] = sc.next();
		}
		for(int test_case = 0;test_case<T;test_case++) {
			for(int i=0;i<8;i++) {
				carr[test_case] = arr[test_case].split("");
			}
		}
		for(int test_case = 0;test_case<T;test_case++) {
			String str = "";

			int month = Integer.parseInt(carr[test_case][4]+carr[test_case][5]);
			int date = Integer.parseInt(carr[test_case][6]+carr[test_case][7]);
			
			if((month==01||month==3||month==5||month==7||month==8||month==10||month==12)&&(date>=1&&date<=31))
				str = carr[test_case][0]+carr[test_case][1]+carr[test_case][2]+carr[test_case][3]+"/"+
						carr[test_case][4]+carr[test_case][5]+"/"+carr[test_case][6]+carr[test_case][7];
			else if(month==2 &&(date>=1&&date<=28))
				str = carr[test_case][0]+carr[test_case][1]+carr[test_case][2]+carr[test_case][3]+"/"+
						carr[test_case][4]+carr[test_case][5]+"/"+carr[test_case][6]+carr[test_case][7];
			else if((month==4||month==6||month==9||month==11)&&(date>=1&&date<=30))
				str = carr[test_case][0]+carr[test_case][1]+carr[test_case][2]+carr[test_case][3]+"/"+
						carr[test_case][4]+carr[test_case][5]+"/"+carr[test_case][6]+carr[test_case][7];
			else
				str = "-1";
			System.out.println("#"+(test_case+1)+" "+str);
		}
		sc.close();
	}
}