import java.util.*;
import java.io.*;

class Main {

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
        int start = 0;
        int end = start + p - 1;
        int[] cnt = new int[4];

        for (int i = start; i <= end; i++) {
            switch(dna[i]) {
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
        if (cnt[0] >= num[0] && cnt[1] >= num[1] && cnt[2] >= num[2] && cnt[3] >= num[3]) {
                answer++;
        }
        end++;
        while (end < s) {
            switch(dna[start]) {
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
            switch(dna[end]) {
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

            if (cnt[0] >= num[0] && cnt[1] >= num[1] && cnt[2] >= num[2] && cnt[3] >= num[3]) {
                answer++;
            }
            start++;
            end++;
        }
        System.out.println(answer);
    }
}