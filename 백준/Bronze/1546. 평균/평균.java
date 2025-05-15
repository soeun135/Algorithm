import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[N];
        double[] newScore = new double[N];
        double sum = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (max < score[i]) {
                max = score[i];
            }
        }
        
        for (int i = 0; i < N; i++) {
            newScore[i] = (double) score[i] / max * 100;
            sum += newScore[i];
        }
        System.out.println(sum / N);
    }
}