package lesson27.Task4;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        Predicate<Integer> intPredicate = x -> x > 0;
        int[] array = new int[20];
        Random random = new Random();

        System.out.print("Positive numbers : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) - 5;
            if (intPredicate.test(array[i])) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("\nWhole array : " + Arrays.toString(array));
    }
}
