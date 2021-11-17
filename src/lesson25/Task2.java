package lesson25;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        try {
            System.out.println(x/y);
        } catch (ArithmeticException exception) {
            System.err.println("ArithmeticException! Division by zero!");
        } finally {
            System.out.println("Further actions");
        }
    }
}
