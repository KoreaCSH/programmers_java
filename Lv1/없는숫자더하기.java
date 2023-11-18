package Lv1;

import java.util.*;

public class 없는숫자더하기 {

    public int solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();
        int answer = 0;

        for(int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }

        for(int i = 0; i < 10; i++) {
            if(!set.contains(i)) {
                answer += i;
            }
        }

        return answer;
    }

}
