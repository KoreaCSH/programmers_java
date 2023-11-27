package Lv2;

public class 카펫 {

    public int[] solution(int brown, int yellow) {

        int totalArea = brown + yellow;
        int w = 0;
        int h = 0;
        int wYellow = 0;
        int hYellow = 0;
        int flag = 0;

        for(int i = 1; i <= (int)Math.sqrt(totalArea); i++) {
            if(totalArea % i == 0) {
                w = totalArea / i;
                h = i;
                for(int j = 1; j <= (int)Math.sqrt(yellow); j++) {
                    if(yellow % j == 0) {
                        wYellow = yellow / j;
                        hYellow = j;
                        if(w - wYellow == 2 && h - hYellow == 2) {
                            flag = 1;
                            break;
                        }
                    }
                }
            }
            if(flag == 1) {
                break;
            }
        }

        int[] answer = {w, h};
        return answer;
    }

}
