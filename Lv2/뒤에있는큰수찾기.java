package Lv2;

import java.util.Stack;

public class 뒤에있는큰수찾기 {

    public int[] solution(int[] numbers) {

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];

        answer[answer.length-1] = -1;
        stack.push(numbers[numbers.length-1]);

        int startIndex = numbers.length - 2;

        while (startIndex >= 0) {

            if(stack.isEmpty()) {
                stack.push(numbers[startIndex]);
                answer[startIndex--] = -1;
            }
            else if(stack.peek() <= numbers[startIndex]) {
                stack.pop();
            }
            else {
                answer[startIndex] = stack.peek();
                stack.push(numbers[startIndex--]);
            }

        }

        return answer;
    }

}
