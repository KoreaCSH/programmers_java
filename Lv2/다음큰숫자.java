package Lv2;

public class 다음큰숫자 {

    public int solution(int n) {

        String binary = Integer.toString(n, 2);
        int oneCount = countOne(binary);

        while(true) {
            int nextOneCount = 0;
            String nextBinary = Integer.toString(++n, 2);
            nextOneCount = countOne(nextBinary);
            if(oneCount == nextOneCount) {
                break;
            }
        }

        int answer = n;
        return answer;
    }

    static int countOne(String binary) {
        int oneCount = 0;

        for(char ch : binary.toCharArray()) {
            if(ch == '1') {
                oneCount++;
            }
        }

        return oneCount;
    }

}
