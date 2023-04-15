import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main{
    public static void main(String arge[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}