package Lv1;

public class 하샤드수 {

    public boolean solution(int x) {

        String strX = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < strX.length(); i++) {
            sum += strX.charAt(i) - '0';
        }

        return x % sum == 0 ? true : false;
    }

}
