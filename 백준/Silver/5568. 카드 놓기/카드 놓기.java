import java.util.*;
import java.io.*;

public class Main {

    static int n, k;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static List<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new boolean[n];
        result = new int[k];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        recur(0);

        System.out.println(integers.size());
    }

    public static void recur(int num) {
        if (num == k) {
            String str = "";
            for (int i = 0; i < k; i++) {
                str += result[i];
            }
            if (!integers.contains(Integer.parseInt(str))) {
                integers.add(Integer.parseInt(str));
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;

                result[num] = arr[i];
                recur(num + 1);

                visited[i] = false;
            }
        }
    }
}
