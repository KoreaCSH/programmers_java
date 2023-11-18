package Lv1;

public class 크기가작은부분문자열 {

    public int solution(String t, String p) {

        int answer = 0;
        int length = p.length();

        for(int i = 0; i + length <= t.length(); i++) {
            if(Long.parseLong(t.substring(i, i + length)) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }

}
