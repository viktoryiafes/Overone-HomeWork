package lesson24;

public class FruitTask3 {
    private String fruitType;
    private String fruitColor;
    private static int fruitPits = 6;

    public FruitTask3(String fruitType, String fruitColor) {
        this.fruitType = fruitType;
        this.fruitColor = fruitColor;
    }

    @Override
    public String toString() {
        return "FruitTask3{" +
                "fruitType='" + fruitType + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                '}';
    }

    public void getAmountMethod(){
        FruitPits fruit = new FruitPits();
        fruit.getAmount();
    }


    static class FruitPits{
        public void getAmount() {
            System.out.println("fruit pits = " + fruitPits);
        }
    }
}

class FruitTask3Main {
    public static void main(String[] args) {
        FruitTask3 fruitInner = new FruitTask3("grape", "green");
        System.out.println(fruitInner);
        fruitInner.getAmountMethod();
    }
}