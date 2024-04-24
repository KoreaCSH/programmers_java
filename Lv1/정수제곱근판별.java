package Lv1;

public class 정수제곱근판별 {

    public long solution(long n) {
        long answer = -1;
        long nSqrt = (long) Math.sqrt(n);
        if(nSqrt * nSqrt == n) {
            answer = (long) Math.pow(nSqrt+1, 2);
        }
        return answer;
    }

}
