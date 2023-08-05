class Solution {
    public static int solution(int[][] board) {
        int n = board.length;
        int answer = n * n;
        int cnt = 0;
        int dr[] = {-1,-1,0,1,1,1,0,-1};
        int dc[] = {0,1,1,1,0,-1,-1,-1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    cnt++;

                    for (int k = 0; k < 8; k++) {
                        int r = i + dr[k];
                        int c = j + dc[k];

                        if (r >= 0 && r < n && c >= 0 && c < n && board[r][c] == 0) {
                            cnt ++;
                            board[r][c] = 2;
                        }
                    }
                }
            }
        }

        return answer - cnt;
    }
}