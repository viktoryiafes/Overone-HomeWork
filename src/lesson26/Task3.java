package lesson26;

import java.io.FileInputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\HomeWork\\src\\lesson26\\3.txt");
        StringBuilder text = new StringBuilder();

        int symbol;
        while ((symbol = fileInputStream.read()) != -1) {
            text.append((char) symbol);
        }
        fileInputStream.close();
        System.out.println(text);

        String[] lines = text.toString().split("[,.]*\\s+");
        for (int i = 0; i < lines.length-1; i++) {
            if (lines[i].charAt(lines[i].length() - 1) == lines[i + 1].charAt(0)) {
                System.out.println(lines[i] + " ---> " + lines[i + 1]);
            }
        }
    }
}
