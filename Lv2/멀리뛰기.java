package Lv2;

public class 멀리뛰기 {

    public long solution(int n) {

        if(n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }

        return dp[n];
    }

}
