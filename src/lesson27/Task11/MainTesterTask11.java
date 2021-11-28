package lesson27.Task11;

import lesson27.Task10.Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTesterTask11 {
    public static void main(String[] args) {
        ArrayList<Tester> nameList = new ArrayList<>();
        nameList.add(new Tester(1, "bbViktoria"));
        nameList.add(new Tester(5, "bbDimitry"));
        nameList.add(new Tester(2, "Olga"));
        nameList.add(new Tester(8, "bMaksim"));
        nameList.add(new Tester(7, "bbMark"));

        List<String> name = nameList
                .stream()
                .map(Tester::getName)
                .collect(Collectors.toList());

        System.out.println(name);
    }
}
