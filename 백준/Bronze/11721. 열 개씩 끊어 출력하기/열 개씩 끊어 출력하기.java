import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = 0;

        while(n < str.length()) {
            for (int i = n; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                n++;
                if (n % 10 == 0) {
                    break;
                }
            }
            System.out.println();
        }
    }
}