package Lv2;

import java.util.*;
import java.util.stream.*;
public class 파일명정렬 {

    public String[] solution(String[] files) {

        List<String> fileList = Arrays.stream(files)
                .sorted((s1, s2) -> {
                    int[] s1Indexs = calNumIndex(s1);
                    int[] s2Indexs = calNumIndex(s2);
                    String head1 = s1.substring(0, s1Indexs[0]);
                    String head2 = s2.substring(0, s2Indexs[0]);

                    if(head1.compareToIgnoreCase(head2) > 0) {
                        return 1;
                    }
                    else if(head1.compareToIgnoreCase(head2) < 0) {
                        return -1;
                    }
                    else {
                        int number1 = Integer.parseInt(s1.substring(s1Indexs[0], s1Indexs[1]));
                        int number2 = Integer.parseInt(s2.substring(s2Indexs[0], s2Indexs[1]));
                        return number1 - number2;
                    }
                })
                .collect(Collectors.toList());

        String[] answer = new String[fileList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = fileList.get(i);
        }

        return answer;
    }

    static int[] calNumIndex(String str) {
        char[] charArr = str.toCharArray();
        int startIndex = -1;
        int endIndex = charArr.length;
        for(int i = 0; i < charArr.length; i++) {
            if(Character.isDigit(charArr[i])) {
                startIndex = i;
                break;
            }
        }

        for(int i = startIndex; i < charArr.length; i++) {
            if(!Character.isDigit(charArr[i])) {
                endIndex = i;
                break;
            }
        }

        return new int[] {startIndex, endIndex};
    }

}
