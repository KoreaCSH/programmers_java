import java.util.*;

public class 같은숫자는싫어 {

    public int[] solution(int []arr) {

        List<Integer> list = new ArrayList<>();

        int top = -1;
        for(int i : arr) {
            if(top == i) {
                continue;
            }
            list.add(i);
            top = i;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
