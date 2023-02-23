import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int na[]=new int[10];
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            int num = scanner.nextInt();
            na[i]=num%42;//10개의 수를 42로 나눈 나머지를 배열에 담음
        }
        for(int check : na) {
        	if(!result.contains(check)) {
        		result.add(check);
        	}
        }
        
        System.out.println(result.size());
        scanner.close();
    }
}