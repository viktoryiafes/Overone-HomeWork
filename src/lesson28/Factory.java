package lesson28;

import java.util.HashMap;
import java.util.Random;

public class Factory implements Runnable {
    private int day = 1;
    private final Random random = new Random();

    Factory(Dump dump) {
        addDump(arrayOfDetail(20));
    }

    private void addDump(int[] resetCount) {
        HashMap<RobotDetails, Integer> robotDetailHashMap = new HashMap<>();
        int counter = 0;
        for (RobotDetails robotDetail : RobotDetails.values()) {
            if (resetCount[counter] > 0) {
                robotDetailHashMap.put(robotDetail, resetCount[counter]);
            }
            counter++;
        }
    }

    private int[] arrayOfDetail(int count) {
        int[] arrayOfDetail = new int[9];
        for (int i = 1; i <= count; i++) {
            int randomCount = this.random.nextInt(9);
            arrayOfDetail[randomCount] += 1;
        }
        return arrayOfDetail;
    }

    @Override
    public void run() {
        while (day <= 50){
            System.out.println("Factory days - " + day);
            addDump(arrayOfDetail(random.nextInt(4) + 1));
            day++;
        }
    }
}