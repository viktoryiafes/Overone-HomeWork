package lesson25;

import java.util.Scanner;

public class Task3Main {
    public static void main(String[] args) {
        System.out.println("Please enter your age!");
        try{
            Scanner scanner = new Scanner(System.in);
            Task3.getAge(scanner.nextInt());
        } catch(ArrayIndexOutOfBoundsException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
