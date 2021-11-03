package lesson2;

public class Service {
    public static void main (String[] args){
        int a = 50;
        long b = 10;
        int result1 = (int) (a+b);
        short result2 = (short) (a-b);
        long result3 = a*b;
        long result4 = a+(a*b)-b;
        System.out.println("Sum:"+result1+" Subtraction:"+result2+" Multiplication:"+result3+" Example:"+result4);
    }
}
