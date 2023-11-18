package Lv1;

public class 신규아이디추천 {

    public String solution(String new_id) {

        String tmp = step1(new_id);
        tmp = step2(tmp);
        tmp = step3(tmp);
        tmp = step4(tmp);
        tmp = step5(tmp);
        tmp = step6(tmp);
        tmp = step7(tmp);

        return tmp;
    }

    static String step1(String id) {
        return id.toLowerCase();
    }

    static String step2(String id) {
        for(char ch : id.toCharArray()) {
            if((ch - 'a' >= 0 && ch - 'a' <= 25) || ch == '-' || ch == '_' || ch == '.' || (ch - '0' >= 0 && ch - '0' <= 9)) {
                continue;
            }
            id = id.replace(ch, '!');
        }
        return id.replace("!", "");
    }

    static String step3(String id) {
        return id.replaceAll("[.]{2,}", ".");
    }

    static String step4(String id) {
        if(!id.isEmpty() && id.charAt(0) == '.') {
            id = id.substring(1);
        }
        if(!id.isEmpty() && id.charAt(id.length()-1) == '.') {
            id = id.substring(0, id.length()-1);
        }
        return id;
    }

    static String step5(String id) {
        if(id.isEmpty()) {
            id += "a";
        }
        return id;
    }

    static String step6(String id) {
        if(id.length() > 15) {
            id = id.substring(0, 15);
            if(id.charAt(id.length()-1) == '.') {
                id = id.substring(0, id.length()-1);
            }
        }
        return id;
    }

    static String step7(String id) {
        if(id.length() <= 2) {
            char ch = id.charAt(id.length()-1);
            while(id.length() < 3) {
                id += String.valueOf(ch);
            }
        }
        return id;
    }

}
