package Lv1;

import java.util.*;

public class 데이터분석 {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        Map<String, Integer> extMap = new HashMap<>();
        extMap.put("code", 0);
        extMap.put("date", 1);
        extMap.put("maximum", 2);
        extMap.put("remain", 3);

        List<int[]> dataList = new ArrayList<>();
        int index = extMap.get(ext);
        int sortBy = extMap.get(sort_by);

        for(int i = 0; i < data.length; i++) {
            if(data[i][index] < val_ext) {
                dataList.add(data[i]);
            }
        }

        Collections.sort(dataList, (data1, data2) -> data1[sortBy] - data2[sortBy]);

        int[][] answer = new int[dataList.size()][4];
        for(int i = 0; i < dataList.size(); i++) {
            answer[i] = dataList.get(i);
        }

        return answer;
    }

}
