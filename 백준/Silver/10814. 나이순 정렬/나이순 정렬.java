import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder []p = new StringBuilder[201]; //입력되는 나이의 범위 1~200
		
		for(int i=0;i<p.length;i++) {
			p[i] = new StringBuilder(); //배열 하나하나마다 StringBuilder를 만들어줌.
		}
	
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[age].append(age).append(" ").append(name).append("\n");
		}
		StringBuilder sb1 = new StringBuilder();
		for(StringBuilder val : p) {
			sb1.append(val);
		}
		System.out.println(sb1);
	}
}