import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strnum = br.readLine(); //숫자하나 입력받음 -> 일단 문자로 받음 !
		int sum = 0;
		int result =0;
		int num = Integer.parseInt(strnum);
		
		String []numarr = new String[10000]; //문자열 배열
		
		for(int j = num/2;j<num; j++) {
			sum=0;
			numarr[0] = Integer.toString(j); //계속 검증해줄 수를 문자열로 만들어서 배열에 넣음
			for(int i=0;i<numarr[0].length();i++) {// 자리수를 다 더하는 반복문
				sum += Character.getNumericValue(numarr[0].charAt(i));
				}
			if(j+sum==num) {
				result = j;
				break;
			}
		}
		System.out.println(result);
	}
}
