package Lv1;

import java.util.*;

public class 체육복 {

    public int solution(int n, int[] lost, int[] reserve) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for(int i = 0; i < reserve.length; i++) {
            map.put(reserve[i], map.get(reserve[i]) + 1);
        }

        for(int i = 0; i < lost.length; i++) {
            map.put(lost[i], map.get(lost[i]) - 1);
        }

        for(int i = 1; i <= n; i++) {
            if(map.get(i) == 0) {
                if(map.getOrDefault(i-1, 0) == 2) {
                    map.put(i, 1);
                    map.put(i-1, 1);
                    continue;
                }
                if(map.getOrDefault(i+1, 0) == 2) {
                    map.put(i, 1);
                    map.put(i+1, 1);
                }
            }
        }

        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(map.get(i) >= 1) {
                answer++;
            }
        }

        return answer;
    }

}
