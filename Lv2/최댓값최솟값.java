package Lv2;

import java.util.*;
public class 최댓값최솟값 {

    public String solution(String s) {

        String[] numbers = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for(String num : numbers) {
            list.add(Integer.parseInt(num));
        }

        Collections.sort(list);

        String min = String.valueOf(list.get(0));
        String max = String.valueOf(list.get(list.size() - 1));

        String answer = min + " " + max;
        return answer;
    }

}