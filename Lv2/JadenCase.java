package Lv2;

public class JadenCase {

    public String solution(String s) {

        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                sb.append(ch);
                isFirst = false;
            }
            else if(ch == ' ') {
                isFirst = true;
                sb.append(" ");
            }
            else if(isFirst) {
                sb.append(Character.toUpperCase(ch));
                isFirst = false;
            }
            else {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String answer = sb.toString();
        return answer;
    }

}
