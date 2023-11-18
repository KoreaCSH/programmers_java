package Lv1;

import java.util.*;

public class 기사단원의무기 {

    public int solution(int number, int limit, int power) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= number; i++) {
            int cnt = 0;
            for(int j = 1; j < Math.sqrt(i); j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            if((int)Math.sqrt(i) * (int)Math.sqrt(i) == i) {
                list.add(cnt * 2 + 1);
            }
            else {
                list.add(cnt * 2);
            }

        }

        int answer = 0;

        for(int i : list) {
            if(i > limit) {
                answer += power;
            }
            else {
                answer += i;
            }
        }

        return answer;
    }

}
