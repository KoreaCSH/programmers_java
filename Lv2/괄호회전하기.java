package Lv2;

import java.util.*;
public class 괄호회전하기 {

    public int solution(String s) {

        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            if(isCorrect(s)) {
                answer++;
            }
            s = s.substring(1) + String.valueOf(s.charAt(0));
        }

        return answer;
    }

    static boolean isCorrect(String str) {
        Stack stack = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            }
            else if(ch == ']' && !stack.isEmpty() && (char)stack.peek() == '[') {
                stack.pop();
            }
            else if(ch == '}' && !stack.isEmpty() && (char)stack.peek() == '{') {
                stack.pop();
            }
            else if(ch == ')' && !stack.isEmpty() && (char)stack.peek() == '(') {
                stack.pop();
            }
            else if(stack.isEmpty()) {
                return false;
            }
        }

        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }

}
