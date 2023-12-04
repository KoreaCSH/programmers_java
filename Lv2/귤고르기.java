package Lv2;

import java.util.*;

import static java.util.stream.Collectors.*;
public class 귤고르기 {

    public int solution(int k, int[] tangerine) {

        Map<Integer, Long> map =
                Arrays.stream(tangerine).boxed()
                        .collect(groupingBy(i -> i, counting()));

        List<Long> sortedTangerineList =
                map.entrySet().stream()
                        .map(Map.Entry::getValue)
                        .sorted()
                        .collect(toList());

        int total = tangerine.length;
        int typeTotal = sortedTangerineList.size();
        int index = 0;

        while(total > k) {
            total -= sortedTangerineList.get(index++);
        }

        return total == k ? typeTotal - index : typeTotal - index + 1;
    }

}
