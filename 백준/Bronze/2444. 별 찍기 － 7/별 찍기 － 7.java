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

		int n = Integer.parseInt(br.readLine());
		int m=1;
		for(int k=1;k<=n;k++) {
			for(int i=0;i<n-k; i++) { //띄어쓰기 갯수
				System.out.print(" ");
			}
			for(int j=0;j<m;j++) {
				System.out.print("*");
			}
			m+=2;
			System.out.println(" ");
		}

		m-=4;
		for(int k=1;k<n;k++) {
			for(int i=k;i>0; i--) { //띄어쓰기 갯수
				System.out.print(" ");
			}
			for(int j=0;j<m;j++) {
				System.out.print("*");
			}
			m-=2;
			System.out.println(" ");

		}
	}
}