package Lv1;

public class 평균구하기 {

    public double solution(int[] arr) {

        int sum = 0;

        for(int i : arr) {
            sum += i;
        }

        double answer = sum / (double) arr.length;
        return answer;
    }

}
