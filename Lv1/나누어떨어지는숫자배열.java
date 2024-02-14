package Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }

        if(list.isEmpty()) {
            return new int[] {-1};
        }

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
