import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt(); //설탕의 무게
		int save [] = new int [5000];
		int x =5;  //5키로 설탕 x
		int y =3;  //3키로 설탕 y
		int count =0;

		for(int i=0; i<10000; i++) {
			for(int j=0; j<10000; j++) {	
				if( ( (j*y)+ (i*x)   ) == height) {   //5x+3y ==설탕의무게의 해를 구한다.
					save[count] =i+j;                 //배열에 저장할 땐 해를 더해서 넣어준다.
					count++;
				} } }

		int min = 5000;
		for (int i=0; i<count; i++) {
			if(save[i]<min) {        //결국 저장된 배열은 봉지의 갯수이므로, 최소값을 구한다.
				min=save[i];
			} }

		if(min==5000) min= -1;		
		System.out.println(min);	}
}