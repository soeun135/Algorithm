import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
        	int num = Integer.parseInt(br.readLine());
        	int sum = 0;
        	List <Integer>list = new ArrayList<>();
        	if(num == -1) break;
        	
        	for(int i=1;i<num;i++) {
        		if(num % i == 0) {
        			sum += i;
        			list.add(i);
        		}
        	}
        	Collections.sort(list);
        	if(sum == num) {
        		sb.append(num+" "+"="+" ");
        		for(int j=0;j<list.size();j++) {
        			sb.append(list.get(j)+" ");
        			if(j != list.size()-1) sb.append("+"+" ");
        		}
        	}
        	else
        		sb.append(num+" "+"is NOT perfect.");
        	sb.append("\n");
        }
        System.out.print(sb);
    }
}

