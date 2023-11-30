package Lv2;

public class 예상대진표 {

    public int solution(int n, int a, int b)
    {
        int count = 1;
        while(!(Math.abs(a - b) == 1 && createNextNumber(a) == createNextNumber(b))) {
            a = createNextNumber(a);
            b = createNextNumber(b);
            count++;
        }

        return count;
    }

    static int createNextNumber(int num) {
        if(num % 2 == 1) {
            return (num+1) / 2;
        }
        else {
            return num / 2;
        }
    }

}
