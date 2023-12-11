package Lv1;

import java.util.*;
public class 제일작은수제거하기 {

    public int[] solution(int[] arr) {

        int[] answer;

        if(arr.length == 1) {
            return new int[] {-1};
        }
        else {

            List<Integer> list = new ArrayList<>();

            int min = Integer.MAX_VALUE;

            for(int i = 0; i < arr.length; i++) {
                if(min > arr[i]) {
                    min = arr[i];
                }
            }

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == min) {
                    continue;
                }
                list.add(arr[i]);
            }

            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }

        }

        return answer;
    }

}
