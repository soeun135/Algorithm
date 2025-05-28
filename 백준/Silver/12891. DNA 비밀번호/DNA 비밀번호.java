import java.util.*;
import java.io.*;

class Main {
    static int[] cnt;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        char[] dna = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0; 
        cnt = new int[4];

        for (int i = 0; i < p; i++) { //부분문자열 범위만큼 첫 세팅
            add(dna[i]);
        }
           if (cnt[0] >= num[0] && cnt[1] >= num[1] && cnt[2] >= num[2] && cnt[3] >= num[3]) {
                answer++;
            }
        for (int i = p; i < s; i++) {
            int j = i - p;
            
            add(dna[i]);
            remove(dna[j]);

            if (cnt[0] >= num[0] && cnt[1] >= num[1] && cnt[2] >= num[2] && cnt[3] >= num[3]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    
    private static void remove(char c) {
        switch(c) {
            case 'A':
                cnt[0]--;
                break;
            case 'C':
                cnt[1]--;
                break;
            case 'G':
                cnt[2]--;
                break;
            case 'T':
                cnt[3]--;
                break;
        }
    }

    private static void add(char c) {

        switch(c) {
            case 'A':
                cnt[0]++;
                break;
            case 'C':
                cnt[1]++;
                break;
            case 'G':
                cnt[2]++;
                break;
            case 'T':
                cnt[3]++;
                break;
        }

    }
}