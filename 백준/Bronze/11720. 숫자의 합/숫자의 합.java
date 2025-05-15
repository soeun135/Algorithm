import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    String num = br.readLine();
    long answer = 0;
    
    //자릿수별로 자를 함수
    while (num.length() > 0) {
        answer += modTen(num);
        num = divideTen(num);
    }
        System.out.println(answer);
    }
    
        
    private static int modTen(String num) {
        return num.charAt(num.length() - 1) - '0';
    }
    private static String divideTen(String num) {
        return num.substring(0, num.length() - 1);
    }
}