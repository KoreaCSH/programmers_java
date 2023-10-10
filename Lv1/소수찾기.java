public class 소수찾기 {

    public int solution(int n) {

        int answer = countPrimeNum(n);
        return answer;
    }

    static public int countPrimeNum(int n) {
        int[] numbers = new int[n+1];

        for(int i = 2; i <= n; i++) {
            numbers[i] = i;
        }

        for(int i = 2; i <= n; i++) {
            if(numbers[i] == 0) continue;
            for(int j = i * 2; j <= n; j += i) {
                numbers[j] = 0;
            }
        }

        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(numbers[i] != 0) {
                count++;
            }
        }

        return count;
    }

}
