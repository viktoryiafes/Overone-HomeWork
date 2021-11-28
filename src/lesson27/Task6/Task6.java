package lesson27.Task6;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

public class Task6 {
    public static void main(String[] args) {
        Function<String, Double> converter = x -> {
            double swapBynUsd = 2.56;
            double swapEurUsd = 0.88;
            double swapRubUsd = 75.47;
            double swapUanUsd = 28.51;
            double swapPlnUsd = 4.17;
            String[] array = x.split(" ");

            if (array.length < 2) {
                return -1.0;
            }
            try {
                double usd = Double.parseDouble(array[0]);
                if (usd < 0) {
                    throw new NumberFormatException();
                }
                String currency = array[1].toUpperCase(Locale.ROOT);
                switch (currency) {
                    case "BYN":
                        return usd * swapBynUsd;
                    case "EUR":
                        return usd * swapEurUsd;
                    case "RUB":
                        return usd * swapRubUsd;
                    case "UAN":
                        return usd * swapUanUsd;
                    case "PLN":
                        return usd * swapPlnUsd;
                    case "USD":
                        return usd;
                    default:
                        return -1.0;
                }
            } catch (NumberFormatException exception) {
                return -1.0;
            }
        };

        System.out.println("Enter the amount and currency:");

        Scanner scanner = new Scanner(System.in);
        String amountAndCurrency = scanner.nextLine();
        double amount;
        if ((amount = converter.apply(amountAndCurrency)) != -1) {
            System.out.println("Amount in dollars: " + amount);
        } else {
            System.err.println("Data entered incorrectly!");
        }
    }
}
