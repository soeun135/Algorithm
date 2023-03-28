import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int count = 1; //이동한 층의 갯수
		int roomnum = 1; // 칸의 층 1부터 시작이라 초깃값 1로 해줌
	
		while(num > roomnum) {
			roomnum += (count*6);
            count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
