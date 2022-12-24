import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i=0;i<count;i++){
            int re = scanner.nextInt();
            String str = scanner.next();
            
            for(int j=0;j<str.length();j++) {
            	for(int k=0;k<re;k++) {
            		System.out.print(str.charAt(j));
            	}
            }
            System.out.println("");
          }
            System.out.println("");
            scanner.close();
        }
    }