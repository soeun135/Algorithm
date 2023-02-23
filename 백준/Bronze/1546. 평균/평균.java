import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       double score[] = new double[num];
        int max=0;
        double sum=0;
        for(int i=0;i<num;i++){
            score[i]=scanner.nextInt();
            if(max<score[i])
                max=(int)score[i];   
        }
        for(int i=0;i<num;i++){
            score[i]= (score[i]/max*100);
            sum+=score[i];
        }
        System.out.println(sum/num);
        scanner.close();
    }
}