package lesson27.Task10;

import java.util.ArrayList;

public class MainTester {
    public static void main(String[] args) {
        ArrayList<Tester> nameList = new ArrayList<>();
        nameList.add(new Tester(1, "bbViktoria"));
        nameList.add(new Tester(5, "bbDimitry"));
        nameList.add(new Tester(2, "Olga"));
        nameList.add(new Tester(8, "bMaksim"));
        nameList.add(new Tester(7, "bbMark"));

        nameList
                .stream()
                .filter(x -> x.getId() > 3
                        && x.getName().length() >= 2
                        && x.getName().charAt(0) == 'b'
                        && x.getName().charAt(1) == 'b')
                .forEach(System.out::println);
    }
}
