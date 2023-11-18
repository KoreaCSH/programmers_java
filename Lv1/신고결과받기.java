package Lv1;

import java.util.*;

public class 신고결과받기 {

    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> mailCnt = new LinkedHashMap<>();

        for(String s : id_list) {
            mailCnt.put(s, 0);
            reportMap.put(s, new HashSet<String>());
        }

        for(int i = 0; i < report.length; i++) {
            String[] tmp = report[i].split(" ");
            String id = tmp[0];
            String reportedId = tmp[1];

            reportMap.get(reportedId).add(id);
        }

        for(String s : reportMap.keySet()) {
            if(reportMap.get(s).size() >= k) {
                for(String id : reportMap.get(s)) {
                    mailCnt.put(id, mailCnt.get(id) + 1);
                }
            }
        }

        return mailCnt.values().stream().mapToInt(i -> i.intValue()).toArray();
    }

}
