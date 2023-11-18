package Lv1;

import java.lang.*;
import java.util.*;

public class 숫자짝궁 {

    public String solution(String X, String Y) {

        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();

        for(char ch : X.toCharArray()) {
            mapX.put(ch - '0', mapX.getOrDefault(ch - '0', 0) + 1);
        }

        for(char ch : Y.toCharArray()) {
            mapY.put(ch - '0', mapY.getOrDefault(ch - '0', 0) + 1);
        }

        for(int i = 9; i >= 0; i--) {
            if(mapX.getOrDefault(i, 0) != 0 && mapY.getOrDefault(i, 0) != 0) {
                for(int j = 0; j < Math.min(mapX.get(i), mapY.get(i)); j++) {
                    sb.append(i);
                }
            }
        }

        if(sb.toString().isEmpty()) {
            return "-1";
        }
        else if(sb.toString().charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }

}
