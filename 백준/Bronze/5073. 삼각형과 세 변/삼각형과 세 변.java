import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int arr[] = {a,b,c};
        int max = a;
        int sum = a;
        for(int i=1;i<arr.length;i++) {
        	if(max < arr[i])
        		max = arr[i];
        	sum +=arr[i];
        }
        sum -= max;
        if( a ==0 && b==0 & c==0) break;
        if(a==b && b==c && a==c) sb.append("Equilateral"+"\n");
        else {
        	 if(sum <= max) sb.append("Invalid"+"\n");
        	
        	 else if(a==b || a==c || b==c) sb.append("Isosceles"+"\n");
        	 else sb.append("Scalene"+"\n");
        }
        }
        System.out.println(sb);
    }
}

