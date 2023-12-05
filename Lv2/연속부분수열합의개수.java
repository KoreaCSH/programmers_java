package Lv2;

import java.util.*;
public class 연속부분수열합의개수 {

    public int solution(int[] elements) {

        Set<Integer> sumSet = new HashSet<>();
        int length = elements.length;

        for(int i = 0; i < length; i++) {
            int j = i;
            int k = length;
            int sum = elements[i];
            sumSet.add(sum);
            while(k > 0) {
                if(i != j % length) {
                    sum += elements[j % length];
                    sumSet.add(sum);
                }
                j++;
                k--;
            }
        }

        int answer = sumSet.size();
        return answer;
    }

}
