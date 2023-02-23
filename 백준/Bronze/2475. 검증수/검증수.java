import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];
        int mul=1;
        int sum=0;
        for(int i=0;i<5;i++){
        	num[i]=scanner.nextInt();
           mul= num[i]*num[i];
           sum+=mul;
           if(num[i]==0)
        	   continue;
        }
        System.out.println(sum%10);
        scanner.close();
    }
}