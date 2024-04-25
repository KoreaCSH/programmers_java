package Lv2;

import java.util.*;

public class 방문길이 {

    public int solution(String dirs) {

        int curX = 0;
        int curY = 0;

        Set<String> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for(char dir : dirs.toCharArray()) {
            if(dir == 'U' && isReachable(curX, curY+1)) {
                addLoad(curX, curY, curX, curY+1, set);
                curY += 1;
            }
            else if(dir == 'D' && isReachable(curX, curY-1)) {
                addLoad(curX, curY, curX, curY-1, set);
                curY -= 1;
            }
            else if(dir == 'L' && isReachable(curX-1, curY)) {
                addLoad(curX-1, curY, curX, curY, set);
                curX -= 1;
            }
            else if(dir == 'R' && isReachable(curX+1, curY)) {
                addLoad(curX+1, curY, curX, curY, set);
                curX += 1;
            }
        }

        return set.size() / 2;
    }

    static boolean isReachable(int nextX, int nextY) {
        if(nextX >= -5 && nextX <= 5 && nextY >= -5 && nextY <= 5) {
            return true;
        }
        return false;
    }

    static void addLoad(int fromX, int fromY, int nextX, int nextY, Set<String> set) {
        String from = "" + fromX + "," + fromY;
        String to = "" + nextX + "," + nextY;
        set.add(from + "/" + to);
        set.add(to + "/" + from);
    }

}
