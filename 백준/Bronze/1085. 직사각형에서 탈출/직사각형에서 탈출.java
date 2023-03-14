import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int min=0;
        int min1 = 1000;
        if(w-x >= h-y)
            min = h-y;
        else
            min = w-x;
        min1 = x-0>y-0 ? y-0:x-0;
        if (min>min1)
            min = min1;
        System.out.println(min);

         scanner.close();
    }
}