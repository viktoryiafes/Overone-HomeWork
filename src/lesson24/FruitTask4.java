package lesson24;

public class FruitTask4 {
    private String fruitType;
    private String fruitColor;
    private static int fruitPits = 4;

    public FruitTask4(String fruitType, String fruitColor) {
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
        FruitPits.getAmount();
    }


    static class FruitPits{
        public static void getAmount() {
            FruitTask4 fruit = new FruitTask4("lemon", "yellow");
            System.out.println(fruit);
            System.out.println("fruit pits = " + fruitPits);
        }
    }
}

class FruitTask4Main {
    public static void main(String[] args) {
        FruitTask4.FruitPits.getAmount();
    }
}
