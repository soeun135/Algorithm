import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N - 1; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i >= 2) { //사이 공백 출력
                for (int j = 1; j <= (i - 1) * 2 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= N * 2 - 1; i++) {
            System.out.print("*");
        }
    }
}