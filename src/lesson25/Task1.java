package lesson25;

public class Task1 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.indexOf(1));
        } catch (NullPointerException exception) {
            System.err.println("NullPointerException is caught, be attentive");
        } finally {
            System.out.println("Do something after");
        }
    }
}