public class 바탕화면정리 {

    static int n, m;
    static int minX = 51;
    static int minY = 51;
    static int maxX = 0;
    static int maxY = 0;

    public int[] solution(String[] wallpaper) {

        n = wallpaper.length;
        m = wallpaper[0].length();

        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    checkX(i);
                    checkY(j);
                }
            }
        }

        int[] answer = {minX, minY, maxX, maxY};
        return answer;
    }

    static void checkX(int x) {
        if(minX > x) {
            minX = x;
        }
        if(maxX < x+1) {
            maxX = x+1;
        }
    }

    static void checkY(int y) {
        if(minY > y) {
            minY = y;
        }
        if(maxY < y+1) {
            maxY = y+1;
        }
    }

}
