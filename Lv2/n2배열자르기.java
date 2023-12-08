package Lv2;

public class n2배열자르기 {

    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left);
        int[] answer = new int[length + 1];

        long r = 0;
        long c = 0;
        int i = 0;

        while(left <= right) {
            r = left / n;
            c = left % n;
            answer[i] = (int)Math.max(r+1, c+1);
            left++;
            i++;
        }

        return answer;
    }

}
