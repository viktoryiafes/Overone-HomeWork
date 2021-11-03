package lesson2;

public class Validator {
    public static void main (String[] args) {
        char a = '5';
        long b = 766544;
        long result1 = a+b;
        long result2 = a-b;
        long result3 = a*b;
        int result4 = (int) (a+(a*b)-b);
        System.out.println("Sum:"+result1+" Subtraction:"+result2+" Multiplication:"+result3+" Example:"+result4);
    }
}
