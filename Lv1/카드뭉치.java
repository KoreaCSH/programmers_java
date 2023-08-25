import java.util.*;

public class 카드뭉치 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        for(String str : cards1) {
            q1.add(str);
        }

        for(String str : cards2) {
            q2.add(str);
        }

        String answer = "Yes";

        for(String str : goal) {
            String target = str;
            if(!q1.isEmpty() && q1.peek().equals(target)) {
                q1.poll();
            }
            else if(!q2.isEmpty() && q2.peek().equals(target)) {
                q2.poll();
            }
            else {
                answer = "No";
                break;
            }
        }

        return answer;
    }

}
