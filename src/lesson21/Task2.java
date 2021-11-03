package lesson21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        String str = "programmer programmer Sun food ";
        String[] s = str.split(" ");
        System.out.println("Text: " + str);

        Set<String> words = new HashSet<>(Arrays.asList(s).subList(1, s.length));
        for (String unicWords: words){
            System.out.println("Unique word: " + unicWords);
        }
    }
}