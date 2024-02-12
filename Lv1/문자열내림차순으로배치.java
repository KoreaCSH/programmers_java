package Lv1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열내림차순으로배치 {

    public String solution(String s) {

        s = Arrays.stream(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        return s;
    }

}
