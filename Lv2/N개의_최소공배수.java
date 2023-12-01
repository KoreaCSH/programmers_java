package Lv2;

import java.util.*;
public class N개의_최소공배수 {

    public int solution(int[] arr) {

        Arrays.sort(arr);

        int n1 = arr[0];
        int n2 = 0;
        for(int i = 1; i < arr.length; i++) {
            n2 = arr[i];
            n1 = lcm(n1, n2);
        }

        return n1;
    }

    static int gcd(int a, int b) {
        int r = 0;
        while(b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b) {
        int n = gcd(a, b);
        return (a*b) / n;
    }

}
