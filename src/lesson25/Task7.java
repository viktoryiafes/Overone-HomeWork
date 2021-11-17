package lesson25;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int a, b, c=0;
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            try {
                a = random.nextInt();
                b = random.nextInt();
                c = 5 / (a / b);
            } catch (ArithmeticException exception) {
                System.err.println("Division by zero occurred.");
            }finally {
                System.out.println("Output: " + c);
            }
        }

    }
}
