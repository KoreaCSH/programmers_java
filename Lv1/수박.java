package Lv1;

public class 수박 {

    public String solution(int n) {

        StringBuilder sb = new StringBuilder();

        if(n==1) {
            return "수";
        }
        else if(n==2) {
            return "Lv11.수박";
        }
        else if(n % 2 == 1) {
            sb.append("수");
            for(int i = 0; i < n/2; i++) {
                sb.append("박수");
            }
        }
        else {
            for(int i = 0; i < n/2; i++) {
                sb.append("Lv11.수박");
            }
        }

        return sb.toString();
    }

}
