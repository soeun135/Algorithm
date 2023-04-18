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
    	int M = Integer.parseInt(st.nextToken());//공 바꿀 횟수

    	int arr[] = new int[N];

    	for(int i=0;i<N;i++) {
    		arr[i] = 1+i; //바구니 번호 1~N
    	}
    	for(int m=0;m<M;m++) {
    		st = new StringTokenizer(br.readLine());
    		int i = Integer.parseInt(st.nextToken());
    		int j = Integer.parseInt(st.nextToken());
    		int temp =0;

    		temp = arr[i-1];
    		arr[i-1] = arr[j-1];
    		arr[j-1] = temp;
    	}
    	
    	for(int i=0;i<N;i++)
    		System.out.print(arr[i]+" ");
    }
}