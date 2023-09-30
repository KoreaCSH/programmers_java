import java.util.*;

public class 예산 {

    public int solution(int[] d, int budget) {

        int answer = 0;
        Arrays.sort(d);

        for(int i : d) {
            if(budget - i < 0) {
                break;
            }
            budget -= i;
            answer++;
        }

        return answer;
    }

}
