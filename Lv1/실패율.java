package Lv1;

import java.util.*;
import java.lang.*;

public class 실패율 {

    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];

        Map<Integer, Integer> clear = new HashMap<>();
        Map<Integer, Integer> notClear = new HashMap<>();
        PriorityQueue<Fail> pq = new PriorityQueue<>();

        for(int i = 1; i <= N+1; i++) {
            clear.put(i, 0);
            notClear.put(i, 0);
        }

        for(int i = 0; i < stages.length; i++) {
            notClear.put(stages[i], notClear.get(stages[i]) + 1);
            for(int j = 1; j <= stages[i]; j++) {
                clear.put(j, clear.get(j) + 1);
            }
        }

        for(int i = 1; i <= N; i++) {
            double failRatio = (clear.get(i) != 0) ? notClear.get(i) / (double)clear.get(i) : 0.0;
            pq.add(new Fail(i, failRatio));
        }

        for(int i = 0; i < N; i++) {
            answer[i] = pq.poll().num;
        }

        return answer;
    }

    static class Fail implements Comparable<Fail> {

        int num;
        double failRatio;

        public Fail(int num, double failRatio) {
            this.num = num;
            this.failRatio = failRatio;
        }

        @Override
        public int compareTo(Fail f) {
            if(Double.compare(f.failRatio, this.failRatio) != 0) {
                return Double.compare(f.failRatio, this.failRatio);
            }
            else {
                return Integer.compare(this.num, f.num);
            }
        }

    }

}
