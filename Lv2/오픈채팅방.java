package Lv2;

import java.util.*;
public class 오픈채팅방 {

    public String[] solution(String[] record) {

        List<ChatRecord> chatRecords = new ArrayList<>();
        Map<String, String> userInfo = new HashMap<>();

        for(String s : record) {
            String[] unitRecord = s.split(" ");
            String action = unitRecord[0];

            if(action.equals("Enter")) {
                String uid = unitRecord[1];
                String nickName = unitRecord[2];
                chatRecords.add(new ChatRecord(action, uid));
            }
            else if(action.equals("Leave")) {
                String uid = unitRecord[1];
                chatRecords.add(new ChatRecord(action, uid));
            }

            if(action.equals("Enter") || action.equals("Change")) {
                String uid = unitRecord[1];
                String nickName = unitRecord[2];
                userInfo.put(uid, nickName);
            }
        }

        String[] answer = new String[chatRecords.size()];
        int index = 0;

        for(ChatRecord chatRecord : chatRecords) {
            if(chatRecord.action.equals("Enter")) {
                answer[index++] = userInfo.get(chatRecord.uid) + "님이 들어왔습니다.";
            }
            else {
                answer[index++] = userInfo.get(chatRecord.uid) + "님이 나갔습니다.";
            }
        }

        return answer;
    }

    static class ChatRecord {
        String action;
        String uid;

        public ChatRecord(String action, String uid) {
            this.action = action;
            this.uid = uid;
        }
    }

}
