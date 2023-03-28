import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		List <Integer> list = new ArrayList<>();
		Map <Integer,Integer> map = new HashMap<>();
		double sum = 0;
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		int avg = (int)Math.round(sum/arr.length);
		int mid = arr[arr.length/2];
		
		int max = arr[arr.length-1];
		int min = arr[0];

		int range;
		
		if(max > 0 && min >0) // 둘다 양수일 때
			range = max-min;
		else if(max <0 && min<0 )//둘다 음수일 때
			range = Math.abs(min)-Math.abs(max);
		else //둘 중에 하나라도 음수거나 0일 때
			range = Math.abs(max) + Math.abs(min);
		
		for(int i:arr) {
			map.put(i,map.getOrDefault(i, 0) +1);
		}
		int maxv = 0; //빈도수 
		for(int key : map.values()) {
			maxv = Math.max(maxv, key); //가장많이 나온 빈도수를 maxv에 넣음.
		}
		for(int key : map.keySet()) {
			if(maxv == map.get(key)) { //최대 빈도수를 가지는 key값을 리스트에 저장
				list.add(key);
			}
		}
		Collections.sort(list);
		
		int mostv;
		if(list.size()>=2) {
			mostv = list.get(1);
		}
		else
			mostv = list.get(0);
			
		sb.append(avg+"\n"+mid+"\n"+mostv+"\n"+range);
		System.out.println(sb);
	}	
}