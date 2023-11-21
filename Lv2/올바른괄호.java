package Lv2;

import java.util.*;
public class 올바른괄호 {

    boolean solution(String s) {

        Stack stack = new Stack<>();
        boolean answer = true;


        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
            }
            else if(!stack.isEmpty() && ch == ')') {
                stack.pop();
            }
            else {
                answer = false;
                return answer;
            }
        }

        if(stack.isEmpty()) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }

}
