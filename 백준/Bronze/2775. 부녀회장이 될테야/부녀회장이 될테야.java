import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int [][] apart = new int [15][15];  // 15층 15호까지 만들기 2차원배열 사용
		
		for (int i=1; i<apart.length; i++) { //0층 주민들 저장하기.
			apart[0][i]=i;
		} 
		
		for (int i=1; i<apart.length; i++) {      //1층 1호층부터 연산을 통해 저장하기.
			int nesting =0;
			for (int j=1; j<apart[i].length; j++) {	
				apart[i][j]=apart[i-1][j]+ nesting;
				nesting= apart[i][j]; 
				}
		}
		
		Scanner sc = new Scanner(System.in);
		
		// 저장된 이차원 배열을 출력하기.
		int test = sc.nextInt();
		for (int i=0; i<test; i++) {
			int floor =sc.nextInt();  //층 
			int arc = sc.nextInt();   //호
			System.out.println(apart[floor][arc]);      // 몇층 몇호를 출력할건지..
		}
	}
}
