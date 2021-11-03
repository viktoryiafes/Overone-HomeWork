package lesson21;

import java.util.ArrayList;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(0);
        listNumber.add(1);
        listNumber.add(7);
        listNumber.add(20);
        listNumber.add(20);
        listNumber.add(-1);
        listNumber.add(0);

        System.out.println(listNumber);
        Counter number = new Counter();
        number.countUnique(listNumber);
    }
}
class Counter{
    public <integer> Counter(){
    }

    public void countUnique(ArrayList <Integer> list){
        boolean emptyNumber = list.isEmpty();
        if (emptyNumber){
            System.out.println("0");
        } else {
            HashSet <Integer> hashSet = new HashSet<>(list);
            int count = hashSet.size();
            System.out.println("Count of unique number: " + count);
        }
    }
}
