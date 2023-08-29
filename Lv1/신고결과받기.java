import java.util.*;

public class 신고결과받기 {

    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Integer> reportCnt = new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();
        Map<String, Integer> mailCnt = new HashMap<>();

        for(String s : id_list) {
            mailCnt.put(s, 0);
        }

        for(int i = 0; i < report.length; i++) {
            String[] tmp = report[i].split(" ");
            String id = tmp[0];
            String reportedId = tmp[1];

            if(!reportCnt.containsKey(reportedId)) {
                reportCnt.put(reportedId, 1);
                reportMap.put(reportedId, new ArrayList<String>());
                reportMap.get(reportedId).add(id);
            }
            else {
                if(reportMap.get(reportedId).contains(id)) {
                    continue;
                }
                int cnt = reportCnt.get(reportedId);
                reportCnt.put(reportedId, cnt+1);
                reportMap.get(reportedId).add(id);
            }
        }

        for(String s : reportCnt.keySet()) {
            if(reportCnt.get(s) >= k) {
                for(String id : reportMap.get(s)) {
                    mailCnt.put(id, mailCnt.get(id) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = mailCnt.get(id_list[i]);
        }

        return answer;
    }

}
