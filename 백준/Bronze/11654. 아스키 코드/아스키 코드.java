import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
       String str = scanner.next();
        System.out.println(str.charAt(0)-0);
        
        scanner.close();
    }
}