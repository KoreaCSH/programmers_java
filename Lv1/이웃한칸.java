package Lv1;

public class 이웃한칸 {

    static int[] dh = {0, 1, -1, 0};
    static int[] dw = {1, 0, 0, -1};

    public int solution(String[][] board, int h, int w) {

        int count = 0;

        int boardH = board.length;
        int boardW = board[0].length;
        String color = board[h][w];

        for(int i = 0; i < 4; i++) {
            int hCheck = h + dh[i];
            int wCheck = w + dw[i];
            if(hCheck >= 0 && hCheck < boardH
                    && wCheck >= 0
                    && wCheck < boardW
                    && color.equals(board[hCheck][wCheck])) {
                count++;
            }
        }

        return count;
    }

}
