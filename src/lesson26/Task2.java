package lesson26;

import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\HomeWork\\src\\lesson26\\2.txt");
        StringBuilder text = new StringBuilder();

        int symbol;
        while ((symbol = fileInputStream.read()) != -1){
            text.append((char) symbol);
        }
        fileInputStream.close();
        System.out.println(text);

        String stringText = text.toString();

        for(String str : stringText.split(" ")){
            if (str.startsWith("a")) {
                System.out.println(str);
            }
            if (str.startsWith("i")){
                System.out.println(str);
            }
            if (str.startsWith("o")){
                System.out.println(str);
            }
            if (str.startsWith("y")){
                System.out.println(str);
            }
            if (str.startsWith("e")){
                System.out.println(str);
            }
        }
    }
}
