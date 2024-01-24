package Lv2;

import java.util.*;
public class 캐시 {

    public int solution(int cacheSize, String[] cities) {

        if(cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> cache = new LinkedList<>();
        int executionTime = 0;

        for(String city : cities) {
            String cityTmp = city.toUpperCase();
            if(cache.remove(cityTmp)) {
                cache.add(cityTmp);
                executionTime += 1;
            }
            else {
                executionTime += 5;
                if(cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                cache.add(cityTmp);
            }
        }

        return executionTime;
    }

}
