package lesson27.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate <String> stringPredicate = x -> x.charAt(0) == 'X' && x.charAt(1) == 'X';

        List<String> stringList = new ArrayList<>();
        stringList.add("The discouraged person dies ahead of time XX");
        stringList.add("XX The discouraged person dies ahead of time.");
        stringList.add("XX");
        stringList.add("xx");
        stringList.add("----");
        stringList.add("XXprogramming");

        getXX(stringList, stringPredicate);
    }

    public static void getXX(List<String> stringList, Predicate <String> operator){
        for (String stringAll : stringList) {
            if (stringAll.length() >= 1 && operator.test(stringAll)) {
                System.out.println(stringAll);
            }
        }
    }
}
