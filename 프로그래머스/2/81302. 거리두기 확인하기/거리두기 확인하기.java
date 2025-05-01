class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[places.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            //거리두기 검사
            answer[i] = (isDistanced(room) ? 1 : 0);
        }
        return answer;
    }

    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {-1, 0, 0, 1};

    public boolean isDistanced(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != 'P') continue;

                //응시자이면
                if (!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }

    public boolean isDistanced(char[][] room, int x, int y) {
        //응시자일 때
        for (int i = 0; i < 4; i++) {
            //이 위치 기준 상하좌우로 
            //파티션이면 continue
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
                continue;
            switch (room[ny][nx]) {
                case 'P':
                    return false;
                case 'X':
                    continue;
                case 'O':
                    if (isNextToVolunteer(room, nx, ny, 3 - i)) return false;
                    break;
            }
        }
        return true;
    }

    public boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;


            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;
            if (room[ny][nx] == 'P') return true;
        }
        return false;
}
}