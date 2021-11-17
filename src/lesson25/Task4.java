package lesson25;

public class Task4 {
    public static void getAge(int age) throws IndexOutOfBoundsException{
        if(age<=0) {
            throw new IndexOutOfBoundsException("Check the entered age is correct!");
        }
        System.out.println("Age: " + age);
    }
}

class IndexOutOfBoundsException extends RuntimeException{
    public IndexOutOfBoundsException(String message){
        super(message);
    }
}
