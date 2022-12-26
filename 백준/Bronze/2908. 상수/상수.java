import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num11[] = new int[3];
        int num22[] = new int[3];
        
        num11[0] = num1%10;
        num1 = num1/10;
        num11[1] = num1%10;
        num11[2] = num1/10;
        
        num22[0] = num2%10;
        num2 = num2/10;
        num22[1] = num2%10;
        num22[2] = num2/10;
        
        if(num11[0]>num22[0]){
            for(int i=0;i<3;i++)
                System.out.print(num11[i]);
        }
        else if(num11[0]==num22[0])
            if(num11[1]>num22[1])
                for(int i=0;i<3;i++)
                System.out.print(num11[i]);
            else
                for(int i=0;i<3;i++)
                System.out.print(num22[i]);
        else
            for(int i=0;i<3;i++)
                System.out.print(num22[i]);
        scanner.close();
    }
}