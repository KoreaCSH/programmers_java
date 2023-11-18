package Lv1;

public class 자릿수더하기 {

    public int solution(int n) {

        int ans = 0;
        String tmp = String.valueOf(n);

        for(char ch : tmp.toCharArray()) {
            ans += ch -'0';
        }

        return ans;
    }

}
