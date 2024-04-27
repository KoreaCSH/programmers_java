package Lv2;

import java.util.*;
public class 롤케이크자르기 {

    public int solution(int[] topping) {

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i : topping) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int answer = 0;

        for(int i : topping) {
            set.add(i);
            if(map.get(i) != null) {
                map.put(i, map.getOrDefault(i, 0)-1);
                if(map.get(i) == 0) {
                    map.remove(i);
                }
            }

            if(set.size() == map.keySet().size()) {
                answer++;
            }
        }

        return answer;
    }

}
