package Lv1;

import java.util.*;

public class 키패드누르기 {

    public String solution(int[] numbers, String hand) {

        StringBuilder ans = new StringBuilder();

        Map<Integer, Point> keys = new HashMap<>();
        keys.put(1, new Point(1, 1));
        keys.put(2, new Point(1, 2));
        keys.put(3, new Point(1, 3));
        keys.put(4, new Point(2, 1));
        keys.put(5, new Point(2, 2));
        keys.put(6, new Point(2, 3));
        keys.put(7, new Point(3, 1));
        keys.put(8, new Point(3, 2));
        keys.put(9, new Point(3, 3));
        keys.put(0, new Point(4, 2));
        keys.put(10, new Point(4, 1));
        keys.put(11, new Point(4, 3));

        int left = 10;
        int right = 11;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = numbers[i];
                ans.append("L");
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                right = numbers[i];
                ans.append("R");
            }
            else {
                if(calDistance(keys.get(left), keys.get(numbers[i])) == calDistance(keys.get(right), keys.get(numbers[i]))) {
                    if(hand.equals("right")) {
                        right = numbers[i];
                        ans.append("R");
                    }
                    else {
                        left = numbers[i];
                        ans.append("L");
                    }
                }
                else if(calDistance(keys.get(left), keys.get(numbers[i])) > calDistance(keys.get(right), keys.get(numbers[i]))) {
                    right = numbers[i];
                    ans.append("R");
                }
                else {
                    left = numbers[i];
                    ans.append("L");
                }
            }
        }

        return ans.toString();
    }

    public static class Point {

        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int calDistance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

}
