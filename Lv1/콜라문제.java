public class 콜라문제 {

    public int solution(int a, int b, int n) {
        int answer = computeCoke(a, b, n);
        return answer;
    }

    static int computeCoke(int a, int b, int n) {
        if(n < a) {
            return 0;
        }
        return ((n / a) * b) + computeCoke(a, b, n - (a * (n/a)) + ((n / a) * b));
    }

}
