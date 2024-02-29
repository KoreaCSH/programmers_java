package Lv2;

import java.util.*;

public class 압축 {

    public int[] solution(String msg) {

        List<Integer> ans = new ArrayList<>();
        int index = 1;

        Map<String, Integer> lwz = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            lwz.put(Character.toString('A' + i), index++);
        }

        int startIndex = 0;
        String substring;
        while(startIndex < msg.length()) {
            for(int i = startIndex + 1; i <= msg.length(); i++) {
                substring = msg.substring(startIndex, i);

                if (!lwz.containsKey(substring)) {
                    lwz.put(substring, index++);
                    ans.add(lwz.get(msg.substring(startIndex, i-1)));
                    startIndex = i-1;
                    break;
                }
                else if (lwz.containsKey(substring) && i == msg.length()) {
                    ans.add(lwz.get(substring));
                    startIndex = msg.length();
                }
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

}
