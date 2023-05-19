import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int second = 0;
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	int C = Integer.parseInt(st.nextToken());
        	int D = Integer.parseInt(st.nextToken());
        	
        	if(C<B && D > A) {//1초라도 생길 수 있는 조건
        		if(C <= A) {
        			if(D <= B)
        				second = D-A;
        			else if(D > B)
        				second = B-A;
        		}
        		else if(C > A) {
        			if(D <= B)
        				second = D-C;
        			else if(D > B)
        				second = B-C;
        		}
        	}
        		System.out.println("#"+i+" "+second);
        }
    }
}

