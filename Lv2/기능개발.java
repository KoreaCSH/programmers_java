package Lv2;

import java.util.*;
public class 기능개발 {

    public List<Integer> solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int period = ((100 - progress) % speed == 0) ? (100 - progress) / speed : (100 - progress) / speed + 1;
            queue.add(period);
        }

        List<Integer> answer = new ArrayList<>();

        int priorityPeriod = queue.poll();
        int count = 1;

        while(!queue.isEmpty()) {
            if(priorityPeriod >= queue.peek()) {
                count++;
                queue.poll();
            }
            else {
                answer.add(count);
                priorityPeriod = queue.poll();
                count = 1;
            }
        }
        answer.add(count);

        return answer;
    }

}
