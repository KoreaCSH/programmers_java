package Lv1;

import java.time.LocalDate;

public class 연도 {

    public String solution(int a, int b) {

        String answer = LocalDate.of(2016, a, b).getDayOfWeek().name().substring(0, 3);

        return answer;
    }

}
