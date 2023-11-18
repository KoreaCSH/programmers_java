package Lv1;

import java.util.*;

public class K번째수 {

    public int[] solution(int[] array, int[][] commands) {

        List<Integer> list;
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int begin = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int count = end - begin + 1;
            int target = commands[i][2] - 1;

            list = new ArrayList<>();
            for(int j = 0; j < count; j++) {
                list.add(array[begin++]);
            }

            Collections.sort(list);
            answer[i] = list.get(target);
        }

        return answer;
    }

}