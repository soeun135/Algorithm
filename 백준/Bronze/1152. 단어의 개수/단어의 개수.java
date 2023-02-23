import java.util.Scanner;
  
class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count=0;
        String splitstr[] = str.split(" ");
        count = splitstr.length;
        if(str.charAt(0) ==' ')
        	if(count>0)
        		count -=1; 
        System.out.println(count);
        scanner.close();
    }
}