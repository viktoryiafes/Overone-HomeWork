package lesson26;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\HomeWork\\src\\lesson26\\1.txt");
        StringBuilder text = new StringBuilder();

        int symbol;
        while ((symbol = fileInputStream.read()) != -1){
            text.append((char) symbol);
        }
        fileInputStream.close();
        System.out.println(text);
    }
}
