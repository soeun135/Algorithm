import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Solution
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
		
		int daycount[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		String arr[] = new String[T];
		for(int test_case = 0;test_case<T;test_case++) {
			arr[test_case] = sc.next();
		}
		for(int test_case = 0;test_case<T;test_case++) {
			int year = Integer.parseInt(arr[test_case].substring(0,4));
			int month = Integer.parseInt(arr[test_case].substring(4,6));
			int date = Integer.parseInt(arr[test_case].substring(6,8));
			
			if((month<=12 && month>=1)&& date<=daycount[month]) {
				if(year<1000) {
					if(month <10 && date<10) //year<1000 month<10 date<10
						System.out.println("#"+(test_case+1)+" 0"+year+"/0"+month+"/0"+date);
					else if(month<10) //year<1000 month<10 date>10
						System.out.println("#"+(test_case+1)+" 0"+year+"/0"+month+"/"+date);
					else //year<1000 month>10 date<10
						System.out.println("#"+(test_case+1)+" 0"+year+"/"+month+"/0"+date);
				}
				else if(month<10) { 
					if(date<10)//year>1000 month<10 date<10
					System.out.println("#"+(test_case+1)+" "+year+"/0"+month+"/0"+date);
					else  //year>1000 month<10 date>10
						System.out.println("#"+(test_case+1)+" "+year+"/0"+month+"/"+date);
				}
				else if(month>10)//date<10
					if(date<10)
					System.out.println("#"+(test_case+1)+" "+year+"/"+month+"/0"+date);
				else
					System.out.println("#"+(test_case+1)+" "+year+"/"+month+"/"+date);
			}
			else
				System.out.println("#"+(test_case+1)+" "+"-1");
		}
		sc.close();
	}
}