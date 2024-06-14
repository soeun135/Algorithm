class Solution {
    public static int[] solution(int n) {
        int[] answer = new int[n * (n + 1) / 2];

        int[][] arr = new int[n][n];
        int v = 1;

        int x = 0;
        int y = 0;
        boolean flag = false;

        while (!flag) {
            //아래로 이동
            while (x < n && arr[x][y] == 0) {
                arr[x++][y] = v++;

                if (n * (n + 1) / 2 + 1 == v) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            x--;
            y++;
            //오른쪽 이동
            while (y < n && arr[x][y] == 0) {
                arr[x][y++] = v++;

                if (n * (n + 1) / 2 + 1 == v) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;

            x--;
            y -= 2;
            //왼쪽 위로 이동
            while (arr[x][y] == 0) {
                arr[x--][y--] = v++;

                if (n * (n + 1) / 2 + 1 == v) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            x += 2;
            y++;

        }

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0)
                    answer[idx++] = arr[i][j];
            }
        }
        return answer;
    }
}