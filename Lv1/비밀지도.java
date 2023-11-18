package Lv1;

public class 비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] subMap1 = createSubMap(arr1, n);
        String[] subMap2 = createSubMap(arr2, n);
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(subMap1[i].charAt(j) == '0' && subMap2[i].charAt(j) == '0') {
                    sb.append(" ");
                }
                else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    static String[] createSubMap(int[] arr, int n) {
        String[] subMap = new String[n];

        for(int i = 0; i < n; i++) {
            int num = arr[i];
            StringBuilder sb = new StringBuilder();

            while(num > 0) {
                sb.append(num % 2);
                num /= 2;
            }

            String binary = sb.reverse().toString();

            while(binary.length() < n) {
                binary = "0" + binary;
            }

            subMap[i] = binary;
            System.out.println(subMap[i]);
        }

        return subMap;
    }

}
