import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    	StringTokenizer st = new StringTokenizer(br.readLine());

    	int N = Integer.parseInt(st.nextToken());//바구니 갯수
    	int M = Integer.parseInt(st.nextToken());//공 넣을 횟수

    	int arr[] = new int[N];

    	for(int i=0;i<N;i++) {
    		arr[i] = 0; //바구니 번호 1~N
    	}
    	for(int m=0;m<M;m++) {
    		st = new StringTokenizer(br.readLine());
    		int i = Integer.parseInt(st.nextToken());
    		int j = Integer.parseInt(st.nextToken());
    		int k = Integer.parseInt(st.nextToken());
    		for(int n=i-1;n<j;n++) {
    			arr[n] = k;
    		}
    	}
    	
    	for(int i=0;i<N;i++)
    		System.out.print(arr[i]+" ");
    }
}