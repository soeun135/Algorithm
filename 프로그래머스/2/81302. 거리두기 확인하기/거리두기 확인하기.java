class Solution {
private static final int dx[] = {-1, 0, 0, 1};
    private static final int dy[] = {0, -1, 1, 0};

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {

        for (int i = 0; i < 4; i++) {
            if (i == exclude) continue;
            
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= room.length || ny < 0 || ny >= room[nx].length) continue;
            if (room[nx][ny] == 'P') return true;
        }
        return false;
    }

    private boolean isDistanced(char[][] room, int x, int y) {//해당 응시자가 거리두기를 지켰는지 검사

        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= room.length || ny < 0 || ny >= room[nx].length) continue;

            switch (room[nx][ny]) {
                case 'P' : return false;
                case 'O' :
                    if (isNextToVolunteer(room, nx, ny, 3 - i)) return false;
                    break;
            }
        }

        return true;
    }
    private boolean isDistanced(char[][] room) { //해당 대기실이 거리두기를 지켰는지 검사
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if (room[i][j] == 'P') { //대기실의 모든 응시자 위치에 대해 반복
                    if (!isDistanced(room, i, j)) return false;
                }
            }            
        }
        return true;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];


        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[places.length][];

            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            if (isDistanced(room)) 
                answer[i] = 1;
            else
                answer[i] = 0;
            //거리두기 검사 후 answer에 기록
        }
        return answer;
    }
}