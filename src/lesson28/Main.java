package lesson28;

public class Main {
    public static void main(String[] args) throws InterruptedException {
            Dump dump = new Dump();

            Factory factory = new Factory(dump);
            Scientist scientist = new Scientist(dump);

            new Thread(factory).start();
            Thread.sleep(200);
            new Thread(scientist).start();
    }
}

enum RobotDetails{
    HEAD,
    BODY,
    LEFT_HAND,
    RIGHT_HAND,
    LEFT_LEG,
    RIGHT_LEG,
    CPU,
    RAM,
    HDD
}
