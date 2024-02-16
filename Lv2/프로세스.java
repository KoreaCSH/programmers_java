package Lv2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 프로세스 {

    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        int count = 0;

        while(!pq.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    pq.poll();
                    count++;

                    if(i == location) {
                        return count;
                    }
                }
            }
        }

        return count;
    }

}
