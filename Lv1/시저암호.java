package Lv1;

public class 시저암호 {

    public String solution(String s, int n) {

        StringBuilder ans = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(ch == ' ') {
                ans.append(" ");
            }
            else if(ch - 'a' >= 0 && ch - 'a' < 26) {
                int tmp = ch - 'a' + n < 26 ? ch - 'a' + n : (ch - 'a' + n) % 26;
                char res = (char)('a' + tmp);
                ans.append(res);
            }
            else {
                int tmp = ch - 'A' + n < 26 ? ch - 'A' + n : (ch - 'A' + n) % 26;
                char res = (char)('A' + tmp);
                ans.append(res);
            }
        }

        return ans.toString();
    }

}
