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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0;
        int arr[] = {a,b,c};
        if(a==b && b==c && a==c) {
        	sum = a+b+c;
        }
        else { //세 길이가 같지 않을 때
        	int max = 0;
        	int ssum = 0;
        	for(int i=0;i<arr.length;i++) {
        		if(max < arr[i]) max = arr[i];
        		ssum+=arr[i];
        	}
        	ssum -= max;
        	if(ssum <= max) {
        		max = ssum -1;
        		sum = ssum + max;
        	}
        	else sum = ssum+max;
        }
        System.out.println(sum);
    }
}

