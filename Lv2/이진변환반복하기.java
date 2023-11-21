package Lv2;

public class 이진변환반복하기 {

    public int[] solution(String s) {

        int zeroDelCount = 0;
        int convertCount = 0;

        while(s.length() != 1) {
            ConvertResult result = convertBinary(s);
            s = result.binary;
            zeroDelCount += result.zeroDelCount;
            convertCount++;
        }

        int[] answer = {convertCount, zeroDelCount};
        return answer;
    }

    static ConvertResult convertBinary(String s) {
        int beforeLength = s.length();
        String zeroDel = s.replaceAll("0", "");
        int afterLength = zeroDel.length();
        String binary = Integer.toString(zeroDel.length(), 2);
        return new ConvertResult(beforeLength - afterLength, binary);
    }

    static class ConvertResult {
        int zeroDelCount;
        String binary;

        ConvertResult(int zeroDelCount, String binary) {
            this.zeroDelCount = zeroDelCount;
            this.binary = binary;
        }
    }

}
