package lesson24;

public class FruitTask2 {

    static class FruitPits{
        public final static int fruitPits = 2;

        public static void getAmount(){
            System.out.println(FruitPits.fruitPits);
        }
    }
}

class FruitTask2Main {
    public static void main(String[] args) {
        FruitTask2.FruitPits.getAmount();
    }
}
