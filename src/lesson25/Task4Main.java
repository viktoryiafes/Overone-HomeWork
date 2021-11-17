package lesson25;

import java.util.Scanner;

public class Task4Main {
    public static void main(String[] args) {
        System.out.println("Please enter your age!");
        try{
            Scanner scanner = new Scanner(System.in);
            Task4.getAge(scanner.nextInt());
        } catch(IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
    }
}
