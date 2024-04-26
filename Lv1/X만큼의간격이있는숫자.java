package Lv1;

public class X만큼의간격이있는숫자 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int adder = x;

        for(int i = 0; i < n; i++) {
            answer[i] = x;
            x += adder;
        }

        return answer;
    }

}
