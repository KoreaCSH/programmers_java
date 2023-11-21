package Lv2;

public class 숫자의표현 {

    public int solution(int n) {

        int[] nums = new int[n+1];

        for(int i = 1; i <= n; i++) {
            nums[i] = i;
        }

        int sum = 0;
        int left = 0;
        int right = 0;
        int answer = 0;

        while(left < nums.length - 1) {
            if(sum <= n && right < nums.length - 1) {
                sum += nums[++right];
            }
            else {
                sum -= nums[++left];
            }

            if(sum == n) {
                answer++;
            }
        }

        return answer;
    }

}
