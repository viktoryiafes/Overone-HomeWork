package lesson25;

public class Task3 {
    public static void getAge(int age) throws ArrayIndexOutOfBoundsException{
        if(age<=0) {
            throw new ArrayIndexOutOfBoundsException("Check the entered age is correct!");
        }
        System.out.println("Age: " + age);
    }
}

class ArrayIndexOutOfBoundsException extends Exception{
    public ArrayIndexOutOfBoundsException(String message){
        super(message);
    }
}
