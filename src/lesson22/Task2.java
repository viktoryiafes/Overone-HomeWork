package lesson22;

import java.util.HashMap;
import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, String> nameHashMap = new HashMap<>();

        nameHashMap.put("Peter", "Parker");
        nameHashMap.put("Harry", "Potter");
        nameHashMap.put("Bruce", "Willis");

        System.out.println(nameHashMap);
        System.out.println(isUnique(nameHashMap));

        nameHashMap.put("Harry", "Willis");
        System.out.println(nameHashMap);
        System.out.println(isUnique(nameHashMap));
    }

    public static boolean isUnique(HashMap<String, String> hashMap) {
        int count = 0;
        String[] nameArray = new String[hashMap.size()];
        for (String nameNull : hashMap.keySet()) {
            nameArray[count] = hashMap.get(nameNull);
            count++;
        }

        for (int i = 0; i < nameArray.length; i++) {
            for (int j = i + 1; j < nameArray.length; j++) {
                if (Objects.equals(nameArray[i], nameArray[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
