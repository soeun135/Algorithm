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

import java.io.*;
import java.util.*;

public class Main{

    static int N, M;
    static int[] result;
    static boolean[] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];
        visited = new boolean[N + 1];

        recur(0);
    }


    public static void recur(int num) {
        if (num == M) {
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
           
            if (!visited[i]) {

                if (num == 0 || (num - 1 >= 0 && result[num - 1] < i)) {
                    visited[i] = true;
                    result[num] = i;
                    recur(num + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
