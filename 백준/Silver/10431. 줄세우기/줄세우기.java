import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        arr = new int[20];

        for (int i = 0; i < t; i++) {
            answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int tc = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            lineCheck();
            System.out.println(tc + " " + answer);

        }
        br.close();
    }

    private static void lineCheck() {

        for (int i = 0; i < 20; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                answer++;
                j--;
            }
            arr[j + 1] = key;
        }
    }
}