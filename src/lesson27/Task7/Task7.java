package lesson27.Task7;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class Task7 {
    public static void main(String[] args) {
        Consumer<String> converter = x -> {
            double swapBynUsd = 2.56;
            double swapEurUsd = 0.88;
            double swapRubUsd = 75.47;
            double swapUanUsd = 28.51;
            double swapPlnUsd = 4.17;
            String[] array = x.split(" ");

            if (array.length >= 2) {
                double usd = -1.0;
                try {
                    usd = Double.parseDouble(array[0]);
                } catch (NumberFormatException exception) {
                    System.err.println("Incorrect number");
                }
                if (usd >= 0) {
                    String currency = array[1].toUpperCase(Locale.ROOT);
                    switch (currency) {
                        case "BYN":
                            System.out.println(usd * swapBynUsd);
                            break;
                        case "EUR":
                            System.out.println(usd * swapEurUsd);
                            break;
                        case "RUB":
                            System.out.println(usd * swapRubUsd);
                            break;
                        case "UAN":
                            System.out.println(usd * swapUanUsd);
                            break;
                        case "PLN":
                            System.out.println(usd * swapPlnUsd);
                            break;
                        case "USD":
                            System.out.println(usd);
                            break;
                        default:
                            System.err.println("Data entered incorrectly!");
                    }
                } else {
                    System.err.println("The entered number is negative!");
                }
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount and currency:");
        String amountAndCurrency = scanner.nextLine();
        converter.accept(amountAndCurrency);
    }
}
