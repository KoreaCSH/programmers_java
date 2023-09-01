import java.util.*;

public class 크레인인형뽑기게임 {

    public int solution(int[][] board, int[] moves) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        Stack<Integer> backet = new Stack<>();
        int answer = 0;

        for(int i = 1; i <= board.length; i++) {
            map.put(i, new ArrayList<>());
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                int doll = board[i][j];
                if(doll != 0) {
                    map.get(j+1).add(doll);
                }
            }
        }

        for(int i = 0; i < moves.length; i++) {
            int n = moves[i];
            if(!map.get(n).isEmpty()) {
                int d = map.get(n).get(0);
                map.get(n).remove(0);
                backet.push(d);
            }
            if(backet.size() >= 2 && backet.get(backet.size()-1) == backet.get(backet.size()-2)) {
                backet.pop();
                backet.pop();
                answer += 2;
            }
        }

        return answer;
    }

}
