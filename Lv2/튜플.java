package Lv2;

import java.util.*;
public class 튜플 {

    public int[] solution(String s) {

        Map<Integer, List<Integer>> tuples = new HashMap<>();
        List<Integer> setOfTuple = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        boolean isOpened = false;

        for(char ch : s.toCharArray()) {
            if(ch == '{') {
                setOfTuple = new LinkedList<>();
                isOpened = true;
            }
            else if(Character.isDigit(ch)) {
                sb.append(ch - '0');
            }
            else if(ch == ',' && isOpened) {
                setOfTuple.add(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
            }
            else if(ch == '}') {
                if(isOpened) {
                    setOfTuple.add(Integer.parseInt(sb.toString()));
                    sb = new StringBuilder();
                }
                tuples.put(setOfTuple.size(), setOfTuple);
                isOpened = false;
            }
        }

        Set<Integer> set = new HashSet<>();
        int tupleLength = tuples.keySet().size();
        int[] answer = new int[tupleLength];

        for(int i = 1; i <= tupleLength; i++) {
            for(int j : tuples.get(i)) {
                if(set.add(j)) {
                    answer[i-1] = j;
                    break;
                }
            }
        }

        return answer;
    }

}
