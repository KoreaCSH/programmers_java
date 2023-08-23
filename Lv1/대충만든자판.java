import java.util.*;

public class 대충만든자판 {

    public int[] solution(String[] keymap, String[] targets) {

        Map<Character, Integer> m = new HashMap<Character, Integer>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < keymap.length; i++) {
            for(int j = 0; j < keymap[i].length(); j++) {
                char key = keymap[i].charAt(j);
                if(!m.containsKey(key)) {
                    m.put(key, j+1);
                }
                else if(m.get(key) > j+1) {
                    m.put(key, j+1);
                }
            }
        }

        for(int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for(int j = 0; j < targets[i].length(); j++) {
                char target = targets[i].charAt(j);
                if(!m.containsKey(target)) {
                    cnt = -1;
                    break;
                }
                cnt += m.get(target);
            }
            ans.add(cnt);
        }

        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }

}
