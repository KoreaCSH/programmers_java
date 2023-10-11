import java.util.*;

public class 다트게임 {

    public int solution(String dartResult) {

        Map<Integer, Integer> map = new HashMap<>();
        Map<Character, Integer> bonus = new HashMap<>();
        bonus.put('S', 1);
        bonus.put('D', 2);
        bonus.put('T', 3);

        int index = 0;
        char[] dartResultCharArray = dartResult.toCharArray();

        for(int i = 0; i < dartResultCharArray.length; i++) {
            char ch = dartResultCharArray[i];
            if(isNumber(ch)) {
                if(isNumber(dartResultCharArray[i+1])) {
                    int point = 10;
                    map.put(++index, point);
                    i++;
                }
                else {
                    int point = ch - '0';
                    map.put(++index, point);
                }
            }
            else if(isAlphabet(ch)) {
                int bonusPoint = (int) Math.pow(map.get(index), bonus.get(ch));
                map.put(index, bonusPoint);
            }
            else {
                if(ch == '*') {
                    if(index == 1) {
                        map.put(index, map.get(index) * 2);
                    }
                    else {
                        map.put(index-1, map.get(index-1) * 2);
                        map.put(index, map.get(index) * 2);
                    }
                }
                else {
                    map.put(index, map.get(index) * -1);
                }
            }
        }

        int answer = 0;

        for(int i : map.keySet()) {
            answer += map.get(i);
        }

        return answer;
    }

    static boolean isNumber(char ch) {
        if(ch - '0' >= 0 && ch - '0' <= 9) {
            return true;
        }
        return false;
    }

    static boolean isAlphabet(char ch) {
        if(Character.isUpperCase(ch)) {
            return true;
        }
        return false;
    }

}
