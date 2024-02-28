package Lv2;

public class 타겟넘버 {

    static int targetNum;
    static int answer = 0;

    public int solution(int[] numbers, int target) {

        targetNum = target;

        calTarget(numbers, 0 ,0);

        return answer;
    }

    public static void calTarget(int[] numbers, int curSum, int curDepth) {

        if(curDepth == numbers.length) {
            if(curSum == targetNum) {
                answer++;
            }
            return;
        }

        calTarget(numbers, curSum + numbers[curDepth], curDepth + 1);
        calTarget(numbers, curSum - numbers[curDepth], curDepth + 1);

    }

}
