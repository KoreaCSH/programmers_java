package Lv1;

import java.util.*;
import java.util.stream.Collectors;

public class 과일장수 {

    public int solution(int k, int m, int[] score) {

        List<Integer> list = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        int count = 0;
        int answer = 0;

        for(int i : list) {
            count++;
            if(count == m) {
                answer += (i * m);
                count = 0;
            }
        }

        return answer;
    }

}
