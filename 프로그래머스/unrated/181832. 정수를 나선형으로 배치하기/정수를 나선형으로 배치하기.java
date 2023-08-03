class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        int k = n * n;
        int cnt = 1;
        while (cnt < k) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if (nx <0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] > 0) {
                d = (d + 1) % 4;
                continue;
            }
            answer[x][y] = cnt;
            cnt ++;
            x = nx;
            y = ny;
        }
        answer[x][y] = cnt;
        return answer;
    }
}