import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            for(int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = N - i; j > 0; j--) {
                System.out.print("*");
            }
            if (i != N - 1)
            System.out.println();
        }
    }
}