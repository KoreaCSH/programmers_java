package Lv1;

public class 공원산책 {

    static char[][] map;
    static int n, m;
    static int x, y;

    public int[] solution(String[] park, String[] routes) {

        n = park.length;
        m = park[0].length();

        map = new char[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
                map[i][j] = park[i].charAt(j);
            }
        }

        for(int i = 0; i < routes.length; i++) {
            move(routes[i]);
        }

        int[] answer = {x, y};
        return answer;
    }

    static void move(String route) {
        String[] tmp = route.split(" ");
        String direction = tmp[0];
        int distance = Integer.parseInt(tmp[1]);
        int tmpX = x;
        int tmpY = y;

        if(direction.equals("N")) {
            for(int i = 0; i < distance; i++) {
                tmpX--;
                if(!check(tmpX, tmpY)) {
                    return;
                }
            }
            x = tmpX;
            y = tmpY;
        }
        else if(direction.equals("S")) {
            for(int i = 0; i < distance; i++) {
                tmpX++;
                if(!check(tmpX, tmpY)) {
                    return;
                }
            }
            x = tmpX;
            y = tmpY;
        }
        else if(direction.equals("W")) {
            for(int i = 0; i < distance; i++) {
                tmpY--;
                if(!check(tmpX, tmpY)) {
                    return;
                }
            }
            x = tmpX;
            y = tmpY;
        }
        else if(direction.equals("E")) {
            for(int i = 0; i < distance; i++) {
                tmpY++;
                if(!check(tmpX, tmpY)) {
                    return;
                }
            }
            x = tmpX;
            y = tmpY;
        }
    }

    static boolean check(int nx, int ny) {
        if(nx >= 0 && ny >= 0 && nx < n && ny < m && map[nx][ny] != 'X') {
            return true;
        }
        else {
            return false;
        }
    }

}
