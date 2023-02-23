import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.next();
        int result[] = new int[26];
        for(int i =0;i<result.length;i++){
            result[i] = -1;
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if((result[c-97])==-1)
                result[c-97]=i;
        }
        for(int j=0;j<result.length;j++){
            System.out.print(result[j]+" ");
        }
        
        scanner.close();
        }
    }