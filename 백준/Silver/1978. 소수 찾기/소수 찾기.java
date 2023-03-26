import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        ArrayList<Integer> so=new ArrayList();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        
        for(int k=1;k<=cnt;k++){//입력한 숫자 갯수만큼 반복
            int num = scanner.nextInt();
            int count=0;
            for(int j=2;j<=num;j++) {
                if(num%j==0) {
                    count++;
               hashMap.put(num,count);
                }
            }
        }
        for(Integer key :   hashMap.keySet()) {
        	if(hashMap.get(key)==1) 
        		so.add(key);
        }
                System.out.println(so.size());        
        scanner.close();
    }
}