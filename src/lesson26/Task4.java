package lesson26;

import java.io.FileInputStream;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\HomeWork\\src\\lesson26\\3.txt");
        StringBuilder text = new StringBuilder();

        int symbol;
        while ((symbol = fileInputStream.read()) != -1) {
            text.append((char) symbol);
        }
        fileInputStream.close();
        System.out.println(text);


        String[] lines = text.toString().split("\\n");
        for (String str : lines) {
            System.out.println(str);
            String[] strPoor = str.split("[ .,]+");
            int strPosition = 0;
            for (int i = 0; i < strPoor.length; i++) {
                if (strPoor[i].matches("^([0123456789]).*")) {
                    strPosition = i;
                }
            }
            System.out.println("\n"+"Words with numbers: " + strPoor[strPosition]);
        }
    }
}
