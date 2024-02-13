package Lv1;

import java.util.stream.IntStream;

public class 약수의개수와덧셈 {

    public int solution(int left, int right) {

        int answer = IntStream.rangeClosed(left, right)
                .map(i -> {
                    if(isEvenDivisorCount(i)) {
                        return i;
                    }
                    else {
                        return -i;
                    }
                })
                .sum();

        return answer;
    }

    public static boolean isEvenDivisorCount(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count % 2 == 0;
    }

}
