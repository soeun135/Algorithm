class Solution {
    private static final int[] dx = {-1, 0, 0, 1};
    private static final int[] dy = {0, -1, 1, 0};

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < 5; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];

            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            // 거리 두기 검사
            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
    
    private boolean isDistanced(char[][] room) {

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (room[i][j] != 'P') continue;

                //거리두기 검사
                if (!isDistanced(room, i, j)) return false;
            }
        }
        return true;
    }

    private boolean isDistanced(char[][] room, int x, int y) {
        //room[x][y]가 거리두기를 지키는 지 검사
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx == room.length || nx < 0 || ny == room[nx].length || ny < 0) continue;

            switch (room[nx][ny]) {
                case 'P':
                    return false;
                case 'O':
                    //이 위치로부터 인접한 곳에 다른 응시자 있는 지 검사
                    if (isNextToVolunteer(room, nx, ny, 3 - d)) return false;
                    break;
            }
        }
        return true;
    }
    
    private boolean isNextToVolunteer(char[][] room, int x, int y, int d) {

        for (int i = 0; i < 4; i++) {
            if (i == d) continue;

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx == room.length || nx < 0 || ny == room[nx].length || ny < 0) continue;

            if (room[nx][ny] == 'P') return true;

        }
        return false;
    }
}