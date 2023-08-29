public class 문자열나누기 {

    public int solution(String s) {

        int answer = 0;
        int cntX = 0;
        int cntNotX = 0;
        int flag = 0;
        char x = s.charAt(0);

        for(int i = 0; i < s.length(); i++) {
            flag = 0;

            if(cntX == 0) {
                x = s.charAt(i);
                cntX++;
                continue;
            }

            if(x == s.charAt(i)) {
                cntX++;
            }
            else {
                cntNotX++;
            }

            if(cntX == cntNotX) {
                answer++;
                cntX = 0;
                cntNotX = 0;
                flag = 1;
            }

        }

        if(flag == 0) {
            answer++;
        }

        return answer;
    }

}
