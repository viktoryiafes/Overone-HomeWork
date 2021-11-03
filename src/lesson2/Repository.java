package lesson2;

public class Repository {
    public static void main (String[] args){
        int a = 15;
        double b = 10.5;
        double result1 = a+b;
        double result2 = a-b;
        double result3 = a*b;
        double result4 = a+(a*b)-b;
        System.out.println("Sum:"+result1+" Subtraction:"+result2+" Multiplication:"+result3+" Example:"+result4);
    }
}
