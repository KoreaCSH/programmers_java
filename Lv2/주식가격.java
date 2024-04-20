package Lv2;

import java.util.*;
public class 주식가격 {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Price> stack = new Stack<>();

        stack.push(new Price(0, prices[0]));
        for(int i = 1; i < prices.length; i++) {
            while(!stack.isEmpty() && stack.peek().price > prices[i]) {
                Price prevPrice = stack.pop();
                answer[prevPrice.sec] = i - prevPrice.sec;
            }
            stack.push(new Price(i, prices[i]));
        }

        while(!stack.isEmpty()) {
            Price latestPrice = stack.pop();
            answer[latestPrice.sec] = prices.length - latestPrice.sec - 1;
        }

        return answer;
    }

    static class Price {
        int sec;
        int price;

        Price(int sec, int price) {
            this.sec = sec;
            this.price = price;
        }
    }

}
