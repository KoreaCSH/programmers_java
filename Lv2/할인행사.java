package Lv2;

import java.util.*;
public class 할인행사 {


    public int solution(String[] want, int[] number, String[] discount) {

        Map<String, Integer> wantCount = new HashMap<>();
        Map<String, Integer> discountCount = new HashMap<>();
        int total = 0;

        for(int i = 0; i < want.length; i++) {
            wantCount.put(want[i], number[i]);
            total += number[i];
        }

        int count = 0;
        int answer = 0;

        for(int i = 0; i < discount.length; i++) {
            discountCount.put(discount[i], discountCount.getOrDefault(discount[i], 0) + 1);
            count++;
            if(count == total) {
                if(check(wantCount, discountCount, want)) {
                    answer++;
                }
                discountCount.put(discount[i-total+1], discountCount.get(discount[i-total+1]) - 1);
                count--;
            }
        }

        return answer;
    }

    static boolean check(Map<String, Integer> wantCount, Map<String, Integer> discountCount, String[] want) {
        for(int i = 0; i < want.length; i++) {
            if(wantCount.get(want[i]) != discountCount.getOrDefault(want[i], 0)) {
                return false;
            }
        }

        return true;
    }

}
