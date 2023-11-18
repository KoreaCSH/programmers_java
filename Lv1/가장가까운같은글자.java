package Lv1;

import java.util.*;

public class 가장가까운같은글자 {

    public int[] solution(String s) {

        int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(map.containsKey(tmp)) {
                answer[i] = i - map.get(tmp);
                map.put(tmp, i);
            }
            else {
                map.put(tmp, i);
                answer[i] = -1;
            }
        }

        return answer;
    }

}
