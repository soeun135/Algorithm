import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        
        int[] rowArr = new int[row];
        int[] colArr = new int[col];
        
        for (int i = 0; i < row; i++) {
            String oneLine = br.readLine();
            for (int j = 0; j < col; j++) {
                char c = oneLine.charAt(j);
                if (c == 'X') {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
        int rowCnt = 0;
        int colCnt = 0;
        for (int i = 0; i < row; i++) {
            if (rowArr[i] == 0) rowCnt++;
        }
        for (int j = 0; j < col; j++) {
            if (colArr[j] == 0) colCnt++;
        }
        System.out.println(Math.max(rowCnt, colCnt));
        br.close();
    }
}