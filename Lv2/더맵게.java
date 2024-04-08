package Lv2;

import java.util.PriorityQueue;

public class 더맵게 {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.add(i);
        }

        int count = 0;
        while (pq.size() > 1 && pq.peek() < K) {

            int s1 = pq.poll();
            int s2 = pq.poll();
            int newS = s1 + (s2 * 2);
            pq.add(newS);
            count++;
        }

        if (pq.size() == 1 && pq.peek() < K) {
            count = -1;
        }

        return count;
    }

}
