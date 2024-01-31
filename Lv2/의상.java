package Lv2;

import java.util.*;
public class 의상 {

    public int solution(String[][] clothes) {

        Map<String, Integer> clothMap = new HashMap<>();

        for(String[] clothArr : clothes) {
            clothMap.put(clothArr[1], clothMap.getOrDefault(clothArr[1], 0) + 1);
        }

        int answer = 1;
        for(String clothType : clothMap.keySet()) {
            answer *= (clothMap.get(clothType) + 1);
        }

        return answer-1;
    }

}
