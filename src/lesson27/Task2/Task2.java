package lesson27.Task2;

import java.util.function.IntBinaryOperator;

public class Task2 {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 15;

        IntBinaryOperator numbers = (a, b) -> {
            if (a < b) {
                return a;
            } else if (a > b) {
                return b;
            }
            return 0;
        };
        System.out.println(numbers.applyAsInt(number1, number2));
    }
}
