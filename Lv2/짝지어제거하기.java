package Lv2;

import java.util.*;
public class 짝지어제거하기 {

    public int solution(String s)
    {
        if(s.length() == 1) {
            return 0;
        }

        Stack stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && (char)stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        int answer = -1;

        if(stack.isEmpty()) {
            answer = 1;
        }
        else {
            answer = 0;
        }

        return answer;
    }

}
