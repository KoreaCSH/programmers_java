package Lv2;

import java.util.*;
public class 스킬트리 {

    public int solution(String skill, String[] skill_trees) {

        List<Character> preSkillList = new ArrayList<>();

        for(char sk : skill.toCharArray()) {
            preSkillList.add(sk);
        }

        int answer = 0;

        for(String s : skill_trees) {
            boolean flag = true;
            int index = 0;
            for(char ch : s.toCharArray()) {
                if(preSkillList.contains(ch)) {
                    if(preSkillList.get(index) == ch) {
                        index++;
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
            }

            if(flag) answer++;
        }

        return answer;
    }

}
