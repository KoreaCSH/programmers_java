package Lv1;

public class 서울에서김서방찾기 {

    final String KIM = "Kim";

    public String solution(String[] seoul) {

        int indexOfKim = -1;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(KIM)) {
                indexOfKim = i;
                break;
            }
        }

        return String.format("김서방은 %d에 있다", indexOfKim);
    }

}
