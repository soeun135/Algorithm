class Solution {
    public int[] solution(int n) {

        int[][] triangle = new int[n][n];
        int v = 1;

        int x = 0;
        int y = 0;

        while (true) {
            // 아래로 이동
            while (true) {
                triangle[x][y] = v++;

                if (x + 1 == n || triangle[x + 1][y] != 0) break;
                x++;
            }
            if (y + 1 == n || triangle[x][y + 1] != 0) break;
            y++;

            //오른쪽으로 이동
            while (true) {
                triangle[x][y] = v++;

                if (y + 1 == n || triangle[x][y + 1] != 0) break;
                y++;
            }
            if (triangle[x - 1][y - 1] != 0) break;
            x--;
            y--;
            // 왼쪽 위로 이동
            while (true) {
                triangle[x][y] = v++;

                if (triangle[x - 1][y - 1] != 0) break;
                x--;
                y--;
            }
            if (x + 1 == n || triangle[x + 1][y] != 0) break;
            x++;
        }

        int[] answer = new int[v - 1];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (triangle[i][j] != 0) {
                    answer[cnt++] = triangle[i][j];
                }
            }
        }
                
        return answer;
    }
}