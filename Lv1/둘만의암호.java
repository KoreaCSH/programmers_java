import java.util.*;
import java.lang.*;

public class 둘만의암호 {

    public String solution(String s, String skip, int index) {

        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < skip.length(); i++) {
            list.add(skip.charAt(i));
        }

        for(int i = 0; i < s.length(); i++) {
            int target = s.charAt(i) - 'a';
            int tmp = index;

            while(tmp > 0) {
                target = (target + 1) % 26;

                if(!list.contains((char)(target + 'a'))) {
                    tmp--;
                }

            }
            sb.append((char)(target + 'a'));
        }

        return sb.toString();
    }

}
