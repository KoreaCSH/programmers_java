package Lv2;

import java.util.*;
public class 최솟값만들기 {

    public int solution(int []A, int []B)
    {
        PriorityQueue<Integer> pqA = new PriorityQueue<>();
        PriorityQueue<Integer> pqB = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < A.length; i++) {
            pqA.add(A[i]);
            pqB.add(B[i]);
        }

        int sum = 0;

        while(!pqA.isEmpty()) {
            sum += (pqA.poll() * pqB.poll());
        }

        return sum;
    }

}
