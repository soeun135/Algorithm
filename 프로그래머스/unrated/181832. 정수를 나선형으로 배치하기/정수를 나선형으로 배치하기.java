class Solution {
    public static int[][] solution(int n) {
        int arr[][] = new int[n][n];

        int d[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int num = 1;
        int curX = 0; int curY = 0;
        arr[curX][curY] = num++;
        boolean visited[][] = new boolean[n][n];
        visited[curX][curY] = true;

        while (num <= n * n) {
            for (int i = 0; i < d.length; i++) {
                while (true) {
                    curX = curX + d[i][0];
                    curY = curY + d[i][1];

                    if (curX < 0 || curX >= n || curY < 0 || curY >=n) {
                        //원래 좌표로 돌려줘야함.
                        if (curX <0 || curX >= n) {
                            curX -= d[i][0];
                        } else {
                            curY -= d[i][1];
                        }
                        break;
                    }
                    if (!visited[curX][curY]) {
                        arr[curX][curY] = num++;
                        visited[curX][curY] = true;
                    } else {
                        curX -= d[i][0];
                        curY -= d[i][1];
                        break;
                    }
                }
            }
        }
        return arr;
    }
}