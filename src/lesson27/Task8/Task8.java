package lesson27.Task8;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task8 {
    public static void main(String[] args) {
        Supplier <String> supplier = () -> {
            Scanner scannerLine = new Scanner(System.in);
            System.out.println("Enter the string!");
            char[] charLine = scannerLine.nextLine().toCharArray();

            if (charLine.length >= 2) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = charLine.length - 1; i >= 0; i--) {
                    stringBuilder.append(charLine[i]);
                }
                return stringBuilder.toString();
            } else {
                return "The string must be more than one character!";
            }
        };
        System.out.println(supplier.get());
    }
}
