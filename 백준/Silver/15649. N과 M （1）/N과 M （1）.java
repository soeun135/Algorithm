/**
 * 1. 아이디어
 * - 백트래킹 재귀함수 안에서, for 돌면서 숫자 선택(이때 방문여부 확인)
 * - 재귀함수에서 M개를 선택할 경우 print
 *
 * 2. 시간복잡도
 * - N! > 가능
 *
 * 3 자료구조
 * - 결과값 저장 int[]
 * - 방문여부 체크 boolean[]
 */

import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        result = new int[M];

        recur(0);
    }
    
    public static void recur(int num) {

        if (M == num) {
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[num] = i;
                recur(num + 1);

                visited[i] = false;
                result[num] = 0;
            }
        }
    }
}
