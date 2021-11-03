package lesson2;

public class Util {
    public static void main (String[] args){
        double a = 68.3;
        float b = 25.7f;
        double result1 = a+b;
        double result2 = a-b;
        double result3 = a*b;
        double result4 = a+(a*b)-b;
        System.out.println("Sum:"+result1+" Subtraction:"+result2+" Multiplication:"+result3+" Example:"+result4);
    }
}
