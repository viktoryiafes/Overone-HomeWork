package lesson28;

import java.util.*;

public class Scientist implements Runnable {
    HashMap<RobotDetails, Integer> madScientist;
    private int day = 1;
    private int countOfRobots;
    private final Random random = new Random();

    private int[] arrayOfDetail(int count) {
        int[] arrayOfDetail = new int[9];
        for (int i = 1; i <= count; i++) {
            int randomCount = this.random.nextInt(9);
            arrayOfDetail[randomCount] += 1;
        }
        return arrayOfDetail;
    }

    Scientist(Dump dump) {
        madScientist = new HashMap<>();
        countOfRobots = 0;
        moveToScientist(arrayOfDetail(random.nextInt(4) + 1));
        System.out.println("Mad Scientist Laboratory " + this.madScientist);
    }

    private void moveToScientist(int[] resetCount) {
        HashMap<RobotDetails, Integer> robotDetailHashMap = new HashMap<>();
        int counter = 0;
        for (RobotDetails robotDetail : RobotDetails.values()) {
            if (resetCount[counter] > 0) {
                robotDetailHashMap.put(robotDetail, resetCount[counter]);
            }
            counter++;
        }

        for (RobotDetails robotDetail : robotDetailHashMap.keySet()) {
            if (madScientist.containsKey(robotDetail)) {
                madScientist.put(robotDetail, madScientist.get(robotDetail)
                        + robotDetailHashMap.get(robotDetail));
            } else {
                madScientist.put(robotDetail, robotDetailHashMap.get(robotDetail));
            }
        }
    }

    private int assemblingRobots() {
        int assembledRobots = 0;
        if (!madScientist.isEmpty()) {
            Collection<Integer> countOfDetail = madScientist.values();
            assembledRobots = Collections.min(countOfDetail);

            switch (assembledRobots) {
                case 0:
                    break;
                default:
                    for (RobotDetails detail : madScientist.keySet()) {
                        if (madScientist.containsKey(detail)) {
                            madScientist.put(detail, madScientist.get(detail) - assembledRobots);
                        }
                    }
                    break;
            }
        }

        System.out.println("Mad scientist assemble " + assembledRobots + " robots");
        return assembledRobots;
    }

    @Override
    public void run() {
        while (day <= 50) {
            moveToScientist(arrayOfDetail(random.nextInt(4) + 1));
            countOfRobots += assemblingRobots();
            System.out.println("<---------------------------------->"+"\n"+"Laboratory days - " + day);
            System.out.println("Collected robots - " + countOfRobots);
            System.out.println("Availability of details - " + this.madScientist);
            day++;
        }
        System.out.println("<---------------------------------->"+"\n"+
                "In total, mad scientists have created " + countOfRobots + " robots!");
    }
}