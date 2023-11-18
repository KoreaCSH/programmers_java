package Lv1;

public class 삼진법뒤집기 {

    public int solution(int n) {

        String ternary = Integer.toString(n, 3);
        StringBuilder ternaryReverse = new StringBuilder(ternary);

        int answer = Integer.parseInt(ternaryReverse.reverse().toString(), 3);
        return answer;
    }

}
