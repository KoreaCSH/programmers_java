import java.util.*l

public class 포켓몬 {

    public int solution(int[] nums) {

        Map<Integer, Integer> pocketmons = new HashMap<>();

        for(int i : nums) {
            pocketmons.put(i, pocketmons.getOrDefault(i, 0) + 1);
        }

        int answer = 0;
        if(pocketmons.keySet().size() >= nums.length / 2) {
            answer = nums.length / 2;
        }
        else {
            answer = pocketmons.keySet().size();
        }

        return answer;
    }

}
