import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int count = Integer.parseInt(scanner.nextLine());
        
        int score = 0;
        int sum[] = new int[count];
        for(int i=0;i<count;i++){
        	String str = scanner.nextLine();
            String [] strArray = str.split("");
            score = 0;
            	for(int j=0;j<strArray.length;j++){
            		if(strArray[j].equals("O")){
            			score+=1;
            			sum[i] += score;
            			
            		}
            		else if(strArray[j].equals("X")) 
            			score = 0;
            	}
        }
    	for(int k=0;k<count;k++) 
    		System.out.println(sum[k]);
    	
        scanner.close();
    }
}