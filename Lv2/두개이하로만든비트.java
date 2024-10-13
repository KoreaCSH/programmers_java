package Lv2;

public class 두개이하로만든비트 {

    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long l = numbers[i];
            String binaryStr = Long.toBinaryString(l);
            answer[i] = calc(binaryStr, l);
        }

        return answer;
    }

    static long calc(String binaryStr, long l) {
        if (binaryStr.lastIndexOf('0') == binaryStr.length()-1) {
            return l+1;
        }

        int lastIndexOfOne = binaryStr.lastIndexOf('0') == -1 ? binaryStr.length() : binaryStr.length() - 1 - binaryStr.lastIndexOf('0');

        long diff = (long) (Math.pow(2, lastIndexOfOne) - Math.pow(2, lastIndexOfOne - 1));
        return l + diff;
    }

}
