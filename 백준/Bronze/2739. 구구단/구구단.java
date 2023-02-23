import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        if(x>=1 && x<=9){
            for(int i=1;i<=9;i++){
                int mul = x*i;
                System.out.println(x+" * "+i+" = "+mul);
            }
        }
        scanner.close();
    }
}