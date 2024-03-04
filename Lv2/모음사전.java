package Lv2;

import java.util.*;

public class 모음사전 {

    public static char[] vowel = new char[]{'A', 'E', 'I', 'O', 'U'};
    public static List<String> dictionary = new ArrayList<>();

    public int solution(String word) {
        createDictionary("", 0, word);
        return dictionary.indexOf(word);
    }

    public void createDictionary(String curWord, int depth, String target) {

        dictionary.add(curWord);

        if(depth == vowel.length || curWord.equals(target)) {
            return;
        }

        for (int i = 0; i < vowel.length; i++) {
            createDictionary(curWord + vowel[i], depth + 1, target);
        }
    }

}
