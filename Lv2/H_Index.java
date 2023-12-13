package Lv2;

import java.util.*;
public class H_Index {

    public int solution(int[] citations) {

        Arrays.sort(citations);
        int left = 0;
        int right = citations[citations.length-1];
        int mid = 0;

        while(left < right) {
            mid = (left + right) / 2;
            int temp = computeH(citations, mid);

            if(mid == temp) {
                break;
            }

            if(mid > temp) {
                right = mid;
            }
            else if(mid < temp){
                left = mid + 1;
            }

        }

        return mid;
    }

    static int computeH(int [] array, int num) {
        int total = array.length;
        int small = 0;
        int big = 0;

        for(int i = 0; i < total; i++) {
            if(array[i] < num) {
                small++;
            }
            else break;
        }

        big = total - small;
        return big;
    }

}
