package Lv1;

public class 푸드파이터대회 {

    public String solution(int[] food) {

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            if(food[i] < 2) {
                continue;
            }
            for(int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }

        String ans = sb.toString() + "0" + sb.reverse().toString();

        return ans;
    }

}
