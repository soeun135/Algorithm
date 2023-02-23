import java.util.Scanner;
import java.util.ArrayList;
  
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int mul = num1*num2*num3;
        int length = (int)( Math.log10(mul)+1 );

        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        int count[] = new int[10];
        
        for(int i =0;i<length;i++){//곱해진 수의 자릿수만큼 반복
                 if(mul%10 !=0){
                     arraylist.add(mul%10);
                     mul/=10;
                 }
                 else{
                     count[0]+=1;
                     mul/=10; 
                 }
        }
        for(int i=0;i<arraylist.size();i++){
            for(int j=1;j<10;j++){//숫자 셀 배열만큼 반복
                if(arraylist.get(i) == j)
                    count[j]++;
            }
        }
        for(int i=0;i<count.length;i++)
            System.out.println(count[i]);
        scanner.close();
    }
}