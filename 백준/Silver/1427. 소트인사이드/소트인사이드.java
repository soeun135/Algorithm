import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				

		String str = br.readLine();
		int arr[] = new int[str.length()];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		//삽입정렬로 구현
		for(int i=1;i<arr.length;i++) {
			int temp = 0;
			for(int j=0;j<i;j++) {
				if(arr[i] >arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}//내림차순 정렬완료
		for(int i=0;i<str.length();i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}