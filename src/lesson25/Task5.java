package lesson25;

public class Task5{
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.indexOf(1));
        }catch (NullPointerException exception){
            try{
                throw new MyException("NullPointerException is caught, be attentive");
            }catch(MyException exception1){
                exception1.printStackTrace();
            }
        }
    }
}

class MyException extends Exception {
    private String str;

    public MyException(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "MyException[" + str + "]";
    }
}