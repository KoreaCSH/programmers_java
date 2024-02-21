package Lv2;

import java.util.*;
public class 뉴스클러스터링 {

    public int solution(String str1, String str2) {

        Set<String> allElement = new HashSet<>();
        Map<String, Integer> map1 = createElementCountMap(str1, allElement);
        Map<String, Integer> map2 = createElementCountMap(str2, allElement);

        if(map1.keySet().size() == 0 && map2.keySet().size() == 0) {
            return 1 * 65536;
        }

        Set<String> intersectionElement = new HashSet<>();

        for(String s : map1.keySet()) {
            if(map2.get(s) != null) {
                intersectionElement.add(s);
            }
        }

        int unionSize = 0;
        int intersectionSize = 0;

        for(String s : allElement) {
            if(intersectionElement.contains(s)) {
                unionSize += Math.max(map1.get(s), map2.get(s));
                intersectionSize += Math.min(map1.get(s), map2.get(s));
            }
            else if(map1.get(s) != null) {
                unionSize += map1.get(s);
            }
            else {
                unionSize += map2.get(s);
            }
        }

        double answer = ((double) intersectionSize / unionSize) * 65536.0;
        return (int)Math.floor(answer);
    }

    public static Map<String, Integer> createElementCountMap(String str, Set<String> allElement) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length() - 1; i++) {
            String element = str.substring(i, i+2);
            String checkElement = str.substring(i, i+2).replaceAll("[^a-zA-Z]", "");
            if(!element.equals(checkElement)) {
                continue;
            }
            element = element.toUpperCase();
            map.put(element, map.getOrDefault(element, 0) + 1);
            allElement.add(element);
        }
        return map;
    }

}
