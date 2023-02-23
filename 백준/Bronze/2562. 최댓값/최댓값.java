import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int max=0;
        for(int i=0;i<9;i++){
            int A = scanner.nextInt();
            if(max<A){
                max=A;
                count=i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
        scanner.close();
    }
}