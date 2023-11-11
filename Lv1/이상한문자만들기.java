public class 이상한문자만들기 {

    public String solution(String s) {

        StringBuilder sb = new StringBuilder();

        int i = 0 ;
        for(char ch : s.toCharArray()) {
            if(ch == ' ') {
                sb.append(' ');
                i = 0;
                continue;
            }

            if(i == 0 || i % 2 == 0) {
                sb.append(Character.toUpperCase(ch));
            }
            else {
                sb.append(Character.toLowerCase(ch));
            }
            i++;
        }

        return sb.toString();
    }

}
