import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max =-1000000;
        int min=1000000;
        int num[] = new int[count];
        for(int i =0;i<count;i++){
            num[i] = scanner.nextInt();
        }
        for(int i=0;i<count;i++){
            if(max<num[i])
                max = num[i];
            if(min>num[i])
                min = num[i];
        }
        System.out.println(min + " "+max);
        scanner.close();
    }
}