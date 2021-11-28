package lesson27.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Task5 {
    public static void main(String[] args) {
        UnaryOperator<Integer> getSquare = x -> x * x;

        System.out.println("Array of numbers squared : ");

        int[] intArray = {1, -2, 10, -5, -2, -0, 55};
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = getSquare.apply(intArray[i]);
        }
        System.out.println(Arrays.toString(intArray));

        BinaryOperator<String> binaryOperator = (string1, string2) -> string1 + " " + string2;

        System.out.println("\nGlued sentence consisting of two parts: ");

        List<String> stringList = new ArrayList<>();
        stringList.add("The discouraged person");
        stringList.add("dies ahead of time.");

        for (int i = 0; i < stringList.size() - 1; i++) {
            System.out.println(binaryOperator.apply(stringList.get(i), stringList.get(i + 1)));
        }
    }
}
