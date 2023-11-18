package Lv1;

public class 부족한금액계산하기 {

    public long solution(int price, int money, int count) {

        long sum = 0;

        for(int i = 0; i < count; i++) {
            sum += (price * (i+1));
        }

        long answer = (sum - money > 0) ? sum - money : 0;

        return answer;
    }

}
