package lesson2;

public class Controller {
    public static void main (String[]args){
        byte a = 6;
        short b = 10;
        int result1 = a+b;
        short result2 = (short) (a-b);
        long result3 = a*b;
        int result4 = a+(a*b)-b;
        System.out.println("Sum: "+result1+" Subtraction: "+result2+" Multiplication: "+result3+" Example: "+result4);
    }
}
