package Lv1;

import java.util.*;

public class 완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {

        String ans = "";
        Map<String, Integer> map = new HashMap<>();

        for(String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for(String s : participant) {
            if(map.get(s) != 0) {
                ans = s;
                break;
            }
        }

        return ans;
    }

}
