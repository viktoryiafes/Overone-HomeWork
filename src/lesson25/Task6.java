package lesson25;

public class Task6 {
    public static void main(String[] args) {
        int a = 0,b;
        int [] array = {1,2,4,7,9,5};
        Object myObject = null;
        try{
            b=10/a;
            System.out.println(array[0]);
            System.out.println(b);
            System.out.println(myObject.hashCode());
        } catch (java.lang.ArrayIndexOutOfBoundsException | ArithmeticException |
                NullPointerException exception){
            System.err.println("An error occurred!");
        }finally {
            System.out.println("Finally block");
        }
    }
}
