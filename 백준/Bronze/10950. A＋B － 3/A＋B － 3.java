import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum[]= new int[count];
        for(int i=0;i<count;i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            sum[i] = (num1+num2);
        }
        for(int i=0;i<count;i++){
            System.out.println(sum[i]);
        }
        scanner.close();
    }
}