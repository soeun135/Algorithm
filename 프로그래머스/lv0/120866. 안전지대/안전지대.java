class Solution {
    public static int solution(int[][] board) {
        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        int n = board.length;
        int answer = n * n;
        int cnt = 0;
        
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    cnt++;
                    for (int k = 0; k < 8 ; k++) {
                        int curX = i + dx[k];
                        int curY = j + dy[k];
                        
                        if (curX >= 0 && curX < n && curY >= 0 && curY < n && board[curX][curY] == 0) {
                            cnt++;
                            board[curX][curY] = 2;
                        }
                    }
                }
            }
        }
        return answer - cnt;
    }
}