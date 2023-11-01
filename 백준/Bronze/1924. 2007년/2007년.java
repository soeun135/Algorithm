import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        String[] result = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        int divMonths = month - 1;
        for (int i = 0; i <= divMonths; i++) {
            totalDays += days[i];
        }
        totalDays += day - 1;

        System.out.println(result[totalDays % 7]);
    }
}