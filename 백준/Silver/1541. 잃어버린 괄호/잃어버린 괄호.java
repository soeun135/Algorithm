import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String[] minusNum = str.split("-");

        for (int i = 0; i < minusNum.length; i++) {

            if (minusNum[i].contains("+")) {
                String[] plusNum = minusNum[i].split("\\+");
                int tmp = 0;
                for (int j = 0; j < plusNum.length; j++) {
                    tmp += Integer.parseInt(plusNum[j]);
                }

                minusNum[i] = Integer.toString(tmp);
            }
        }
        int answer = Integer.parseInt(minusNum[0]);
        for (int i = 1; i < minusNum.length; i++) {
            answer -= Integer.parseInt(minusNum[i]);
        }
        System.out.println(answer);
    }
}