package Lv1;

public class 소수만들기 {

    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < nums.length-2; i++) {
            sum += nums[i];
            for(int j = i+1; j < nums.length-1; j++) {
                sum += nums[j];
                for(int t = j+1; t < nums.length; t++) {
                    sum += nums[t];
                    if(isPrime(sum)) {
                        answer++;
                    }
                    sum -= nums[t];
                }
                sum -= nums[j];
            }
            sum -= nums[i];
        }

        return answer;
    }

    static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        else if(num == 2 || num == 3) {
            return true;
        }
        else {
            for(int i = 2; i <= (int)Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
