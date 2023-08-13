class Solution {
     static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int E[] = {0,1};
        int S[] = {1,0};
        int W[] = {0,-1};
        int N[] = {-1,0};
        int n = park.length;
        String arr[][] = new String[n][park[0].length()];
        Point cur = new Point(0,0);
        for (int i = 0; i < n; i++) {
            String str = park[i];
            for (int j = 0; j < str.length() ; j++) {
                char s = str.charAt(j);
                if (s == 'S') {
                    cur = new Point(i, j);
                }
                arr[i][j] = String.valueOf(s);
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String str[] = routes[i].split(" ");
            boolean flag = true;
            int d[] = new int[2];
            switch (str[0]) {
                case "E":
                    d = E.clone();
                    break;
                case "S":
                    d = S.clone();
                    break;
                case "W":
                    d = W.clone();
                    break;
                case "N":
                    d = N.clone();
                    break;
            }
            int nx = cur.x;
            int ny = cur.y;

            for (int j = 0; j < Integer.parseInt(str[1]); j++) {
                nx += d[0];
                ny += d[1];

                if (nx < 0 || nx >= n || ny < 0 || ny >= park[0].length() || arr[nx][ny].equals("X")){
                    flag = false;
                    break;
                }
            }

            if (flag) {
                cur.x = nx;
                cur.y = ny;
            }
        }
        answer[0] = cur.x;
        answer[1] = cur.y;
        return answer;
    }
}