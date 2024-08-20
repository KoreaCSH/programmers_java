package Lv2;

import java.util.Stack;

public class 택배상자 {

    public int solution(int[] order) {

        Stack<Integer> sub = new Stack<>();
        int curOrder = 0;

        for(int i = 1; i <= order.length; i++) {
            if(order[curOrder] == i) {
                curOrder++;
            }
            else {
                sub.push(i);
            }
            while(!sub.isEmpty() && sub.peek() == order[curOrder]) {
                curOrder++;
                sub.pop();
            }
        }
        
        return curOrder;
    }

}
