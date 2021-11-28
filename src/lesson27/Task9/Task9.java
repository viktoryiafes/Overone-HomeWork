package lesson27.Task9;

import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("The discouraged person dies ahead of time aa");
        list.add("aaaaaa");
        list.add("The discouraged  aa person dies ahead of time");
        list.add("-----");
        list.add("a ");
        list.add("aa");
        list.add("  ");
        list.add("aaThe discouraged person dies ahead of time");

        list.stream()
                .filter(x -> x.length() >= 2 && x.charAt(0) == 'a' && x.charAt(1) == 'a')
                .forEach(System.out::println);
    }
}
