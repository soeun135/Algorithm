import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum =0;
        int num = 10000;
        int ch = 0;
        if(M == 1 || N == 1)
        	if(M == 1) M+=1;
        	else N+=1;
        	for(int i=M;i<=N;i++) {
            	for(int j=2;j<i;j++) {
            		if( i % j == 0 ){//1과 자기 자신 제외 약수가 존재
            			ch = 1;
            			break;
            		}
            	}
            	if(ch == 1) { ch = 0; continue; }
            	else {
            		if(num > i) {
            			num = i;
            		}
            		sum+=i;
            	}
            }

        if( num == 10000 ) System.out.println(-1);
        else
        System.out.println(sum+"\n"+num);
        
    }
}

