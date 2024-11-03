import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[] board;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new int[N];

        recur(0);

        System.out.println(result);
    }

    public static void recur(int row) {
        if (row == N) {
            result++;
            return;
        }

        for (int col = 0; col < N; col++) {
            board[row] = col;
            if (isValid(row)) {
                recur(row + 1);
            }
        }
    }

    public static boolean isValid(int row) {

        for (int i = 0; i < row; i++) {
            if (board[i] == board[row] || Math.abs(board[row] - board[i]) == row - i) {
                return false;
            }
        }
        
        return true;
    }
}
