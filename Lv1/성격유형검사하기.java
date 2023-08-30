import java.util.*;

public class 성격유형검사하기 {

    public String solution(String[] survey, int[] choices) {

        Map<Integer, String> characterIndex = new HashMap<>();
        Map<Character, Integer> result = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        characterIndex.put(1, "RT");
        characterIndex.put(2, "CF");
        characterIndex.put(3, "JM");
        characterIndex.put(4, "AN");

        for(int i = 0; i < survey.length; i++) {
            String tmp = survey[i];
            char na = tmp.charAt(0);
            char a = tmp.charAt(1);

            if(choices[i] < 4) {
                int score = choices[i];
                if(choices[i] == 1) {
                    score = 3;
                }
                else if(choices[i] == 3) {
                    score = 1;
                }
                result.put(na, result.getOrDefault(na, 0) + score);
            }
            else if(choices[i] > 4) {
                result.put(a, result.getOrDefault(a, 0) + choices[i] - 4);
            }
        }

        for(int i = 1; i <= 4; i++) {
            String character = characterIndex.get(i);
            if(result.getOrDefault(character.charAt(0), 0) == result.getOrDefault(character.charAt(1), 0)) {
                ans.append(character.charAt(0));
            }
            else {
                char ch = (result.getOrDefault(character.charAt(0), 0) > result.getOrDefault(character.charAt(1), 0)) ?
                        character.charAt(0) : character.charAt(1);
                ans.append(ch);
            }
        }

        return ans.toString();
    }

}
