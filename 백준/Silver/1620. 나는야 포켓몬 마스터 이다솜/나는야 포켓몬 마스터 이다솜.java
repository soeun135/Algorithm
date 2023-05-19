import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map <String,String> map = new HashMap<>();
        List <String> list = new ArrayList<>();
        for(int i=1;i<=N;i++) {
        	String input = br.readLine();
        	map.put(input,Integer.toString(i)); //이름 , 번호 순
        	list.add(input);
        }
        for(int i=0;i<M;i++) {
        	String str = br.readLine();
        	if(str.charAt(0) >= 48 && str.charAt(0) <= 57 ) { //숫자 입력시
        		sb.append(list.get(Integer.parseInt(str)-1)+"\n");
        	}
        	else //이름 입력시 -> 번호 출력
        		sb.append(map.get(str)+"\n");
        }
        System.out.println(sb);
    }
}

