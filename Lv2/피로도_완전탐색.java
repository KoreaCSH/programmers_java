package Lv2;

public class 피로도_완전탐색 {

    static boolean[] isChecked;
    static int N;

    public int solution(int k, int[][] dungeons) {

        isChecked = new boolean[dungeons.length];

        exploreDungeon(dungeons, k, 0);

        return N;
    }

    public static void exploreDungeon(int[][] dungeons, int k, int depth) {

        for(int i = 0; i < dungeons.length; i++) {
            if(!isChecked[i] && k >= dungeons[i][0]) {
                isChecked[i] = true;
                exploreDungeon(dungeons, k - dungeons[i][1], depth + 1);
                isChecked[i] = false;
            }
        }

        N = Math.max(N, depth);
    }

}
