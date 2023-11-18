package Lv1;

import java.util.*;

public class 개인정보수집유효기간 {

    static int todayY;
    static int todayM;
    static int todayD;
    static Map<String, Integer> map = new HashMap<>();
    static List<Integer> ans = new ArrayList<>();

    public int[] solution(String today, String[] terms, String[] privacies) {

        String[] tmp1 = today.split("[.]");
        todayY = Integer.parseInt(tmp1[0]);
        todayM = Integer.parseInt(tmp1[1]);
        todayD = Integer.parseInt(tmp1[2]);

        for(int i = 0; i < terms.length; i++) {
            String term = terms[i];
            String[] tmp2 = term.split(" ");
            map.put(tmp2[0], Integer.parseInt(tmp2[1]));
        }

        for(int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] tmp3 = privacy.split(" ");
            if(cal(tmp3[0], tmp3[1])) {
                ans.add(i+1);
            }
        }

        int[] answer = new int[ans.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }

    public boolean cal(String date, String term) {
        String[] tmp = date.split("[.]");
        int y = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        int d = Integer.parseInt(tmp[2]);

        int pd = (d == 1) ? 28 : d-1;
        int pm = (pd == 28) ? m + map.get(term) - 1 : m + map.get(term);
        int n = (pm-1)/12;
        int py = (pm > 12) ? y + n : y;

        pm = pm - (12 * n);

        if(todayY > py) {
            return true;
        }
        else if(todayY >= py && todayM > pm) {
            return true;
        }
        else if(todayY >= py && todayM >= pm && todayD > pd) {
            return true;
        }
        else {
            return false;
        }

    }

}
