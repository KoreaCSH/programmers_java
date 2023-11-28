package Lv2;

import java.util.*;
public class 영어끝말잇기 {

    public int[] solution(int n, String[] words) {

        Map<Integer, Integer> countMap = new HashMap<>();
        List<String> checkedWords = new ArrayList<>();
        int[] answer = new int[2];

        int num = 1;
        char lastChar = words[0].charAt(0);

        for(String s : words) {
            if(num > n) {
                num = 1;
            }

            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if(checkedWords.contains(s)
                    || lastChar != s.charAt(0)) {
                answer[0] = num;
                answer[1] = countMap.get(num);
                break;
            }
            else {
                checkedWords.add(s);
                lastChar = s.charAt(s.length()-1);
                num++;
            }
        }

        return answer;
    }

}
