import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result[] = new int[num1];
        for(int i =0;i<num1;i++){
            int num3 = scanner.nextInt();
            if(num3 < num2)
                result[i]=num3;
        }
        for(int i =0;i<num1;i++)
        	if(result[i]!=0)
        		System.out.print(result[i]+" ");
        scanner.close();
    }
}