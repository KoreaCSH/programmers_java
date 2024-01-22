package Lv1;

import java.util.*;
public class 가장많이받은선물 {

    private static HashMap<String, Integer> ans;

    public int solution(String[] friends, String[] gifts) {

        HashMap<String, HashMap<String, Integer>> giftRecord = new HashMap<>();
        HashMap<String, Integer> giftIndex = new HashMap<>();
        ans = new HashMap<>();

        for(String friend : friends) {
            giftRecord.put(friend, new HashMap<>());
            giftIndex.put(friend, 0);
            ans.put(friend, 0);
        }

        for(String gift : gifts) {
            String[] tmp = gift.split(" ");
            String sender = tmp[0];
            String receiver = tmp[1];

            HashMap<String, Integer> senderRecord = giftRecord.get(sender);
            senderRecord.put(receiver, senderRecord.getOrDefault(receiver, 0) + 1);

            giftIndex.put(sender, giftIndex.get(sender) + 1);
            giftIndex.put(receiver, giftIndex.get(receiver) - 1);
        }

        for(int i = 0; i < friends.length; i++) {
            for(int j = i+1; j < friends.length; j++) {
                int sendCount = giftRecord.get(friends[i]).getOrDefault(friends[j], 0);
                int receiveCount = giftRecord.get(friends[j]).getOrDefault(friends[i], 0);

                if(sendCount == receiveCount) {
                    int senderIndex = giftIndex.get(friends[i]);
                    int receiverIndex = giftIndex.get(friends[j]);

                    if(senderIndex > receiverIndex) {
                        ans.put(friends[i], ans.get(friends[i]) + 1);
                    }
                    else if(senderIndex < receiverIndex) {
                        ans.put(friends[j], ans.get(friends[j]) + 1);
                    }
                }
                else if(sendCount > receiveCount) {
                    ans.put(friends[i], ans.get(friends[i]) + 1);
                }
                else {
                    ans.put(friends[j], ans.get(friends[j]) + 1);
                }
            }
        }

        int max = 0;

        for(String s : ans.keySet()) {
            if(max < ans.get(s)) {
                max = ans.get(s);
            }
        }

        return max;
    }

}
