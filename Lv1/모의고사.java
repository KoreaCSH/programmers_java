package Lv1;

import java.util.*;

public class 모의고사 {

    public int[] solution(int[] answers) {

        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        list.add(cal(answers, s1));
        list.add(cal(answers, s2));
        list.add(cal(answers, s3));

        int max = -1;
        for(int i = 0; i < list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(max == list.get(i)) {
                ans.add(i+1);
            }
        }

        return ans.stream().mapToInt(i -> i.intValue()).toArray();
    }

    static int cal(int[] answers, int[] s) {
        int point = 0;
        int i = 0;
        int j = 0;

        while(i < answers.length) {
            if(answers[i++] == s[j++]) {
                point++;
            }
            if(j >= s.length) {
                j = 0;
            }
        }

        return point;
    }

}
