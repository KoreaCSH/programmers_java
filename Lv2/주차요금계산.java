package Lv2;

import java.util.*;
import java.util.stream.*;
public class 주차요금계산 {

    static int basisTime;
    static int basisPrice;
    static int unitTime;
    static int unitPrice;

    public int[] solution(int[] fees, String[] records) {

        basisTime = fees[0];
        basisPrice = fees[1];
        unitTime = fees[2];
        unitPrice = fees[3];

        Map<String, String> curParking = new HashMap<>();
        Map<String, Integer> curParkingFee = new HashMap<>();

        // IN 이라면 Map 에 넣고, OUT 이면 map 에서 빼기
        for(String s : records) {
            String[] tmp = s.split(" ");
            String time = tmp[0];
            String carId = tmp[1];
            String sprCd = tmp[2];

            if("IN".equals(sprCd)) {
                curParking.put(carId, time);
            }
            else {
                String inTime = curParking.remove(carId);
                int totalTime = calTime(inTime, time);
                curParkingFee.put(carId, curParkingFee.getOrDefault(carId, 0) + totalTime);
            }
        }

        for(String carId : curParking.keySet()) {
            String inTime = curParking.get(carId);
            int totalTime = calTime(inTime, "23:59");
            curParkingFee.put(carId, curParkingFee.getOrDefault(carId, 0) + totalTime);
        }

        List<String> carIdSortedList = curParkingFee.keySet().stream().sorted().collect(Collectors.toList());
        int[] answer = new int[carIdSortedList.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = calFee(curParkingFee.get(carIdSortedList.get(i)));
        }

        return answer;
    }

    static int calTime(String inTime, String outTime) {
        String[] inTimeSpl = inTime.split(":");
        String[] outTimeSpl = outTime.split(":");

        int inHour = Integer.parseInt(inTimeSpl[0]);
        int inMin = Integer.parseInt(inTimeSpl[1]);
        int outHour = Integer.parseInt(outTimeSpl[0]);
        int outMin = Integer.parseInt(outTimeSpl[1]);
        int totalMin = ((outHour - inHour) * 60) + (outMin - inMin);

        return totalMin;
    }

    static int calFee(int totalTime) {
        int fee = 0;
        if(totalTime > basisTime) {
            int addTime = totalTime - basisTime;
            int n = (addTime % unitTime) == 0 ? addTime / unitTime : addTime / unitTime + 1;
            fee = basisPrice + (n * unitPrice);
        }
        else {
            fee = basisPrice;
        }
        return fee;
    }

}
