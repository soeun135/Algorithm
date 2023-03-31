import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//유클리드의 호제법으로 풀었다
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int min = 0;
		int max = 0;
		int GCF=0;
		if(num1>num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		while(GCF ==0) { //최대공약수
			int R = max %min;
			if(R == 0)
				GCF = min;
			else { //나머지가 있으면
				max = min;
				min = R;
			}
		}	
		//최소공배수 LCM
		int LCM = num1*num2/GCF;
		System.out.println(GCF+"\n"+LCM);
    }
}