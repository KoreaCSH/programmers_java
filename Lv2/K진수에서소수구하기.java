package Lv2;

public class K진수에서소수구하기 {

    public int solution(int n, int k) {
        int answer = 0;

        String kRadix = Integer.toString(n, k).replaceAll("0+", "0");
        String[] splitByZero = kRadix.split("0");

        for(String s : splitByZero) {
            if (isPrime(s, k)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean isPrime(String s, int k) {
        if(!s.contains("0") && !s.equals("1")) {
            long num = Long.parseLong(s);
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
