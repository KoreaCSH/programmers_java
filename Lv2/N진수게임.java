package Lv2;

import java.util.*;

public class N진수게임 {

    public String solution(int n, int t, int m, int p) {

        List<String> list = new ArrayList<>();
        list.add("0");
        int i = 1;
        while (list.size() < (m * t) + p) {
            String nRadix = Integer.toString(i++, n);
            for (char ch : nRadix.toCharArray()) {
                list.add(Character.toString(ch).toUpperCase());
            }
        }

        StringBuilder answer = new StringBuilder();
        int count = 0;
        int index = p - 1;

        while (count < t) {
            answer.append(list.get(index));
            index += m;
            count++;
        }

        return answer.toString();
    }

}
