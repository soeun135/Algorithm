import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Solution
{
	public static void main(String args[]) throws Exception
	{
		//System.setIn(new FileInputStream("C:\\so_Project\\workspace\\BaekJoon\\src\\algorithm\\input.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		String grade[] = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0" }; //학점이 저장된 배열
		
		for(int i=1;i<=T;i++) { //테스트 케이스만큼 반복
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); //N명의 학생 중
			int K = Integer.parseInt(st.nextToken()); //K 번째의 학생 등수를 알고싶음
			Double arr[] = new Double[N]; //학생들의 평점을 저장할 배열
			int m;
			for(int j=0;j<N;j++) { //N명의 학생의 총점 배열에 저장
				st = new StringTokenizer(br.readLine());
				int middle = Integer.parseInt(st.nextToken());
				int finaltest = Integer.parseInt(st.nextToken());
				int work = Integer.parseInt(st.nextToken());
				
				arr[j] = middle*0.35 + finaltest*0.45+work*0.2;
			}
			double score = arr[K-1]; //K번째 학생의 점수를 score에 저장
			Arrays.sort(arr,Collections.reverseOrder()); //배열 정렬 내림차순

			for(m =0;m<N;m++) {
				if(arr[m] == score) {
					break;
				}
			}
			System.out.println("#"+i+" "+grade[m/(N/10)]);
		}
	}
}