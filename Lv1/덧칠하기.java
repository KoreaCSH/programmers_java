public class 덧칠하기 {

    public int solution(int n, int m, int[] section) {

        int answer = 0;

        if(section.length == 1) {
            answer = 1;
        }
        else {
            int tmp = section[0] + m - 1;
            int count = 1;
            for(int i = 1; i < section.length; i++) {
                if(section[i] <= tmp) {
                    continue;
                }
                tmp = section[i] + m - 1;
                count++;
            }
            answer = count;
        }

        return answer;
    }

}
