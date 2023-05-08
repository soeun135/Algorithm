import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int arr[] = {a,b,c};
        
        if(a==60 && b== 60 && c== 60) {
        	bw.write("Equilateral");
        }
        else if(a+b+c == 180) {
        	int ch = 0;
        	
        	if(arr[0] == arr[1]) ch =1;
        	else if(arr[1] == arr[2])ch=1;
        	else if(arr[0] == arr[2])ch = 1;
        	
        	if(ch == 1) bw.write("Isosceles");
        	else bw.write("Scalene");
        }
        else bw.write("Error");
        
        bw.flush();
        bw.close();
    }
}

