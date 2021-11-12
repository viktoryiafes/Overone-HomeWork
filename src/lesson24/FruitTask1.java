package lesson24;

public class FruitTask1 {
    private final String fruitType;
    private final String fruitColor;
    private final FruitPits fruitPits;

    public FruitTask1(String fruitType, String fruitColor, FruitPits fruitPits) {
        this.fruitType = fruitType;
        this.fruitColor = fruitColor;
        this.fruitPits = fruitPits;
    }

    @Override
    public String toString() {
        return "FruitTask1{" +
                "fruitType='" + fruitType + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                ", fruitPits=" + fruitPits +
                '}';
    }

    static class FruitPits{
        int pits;
        public FruitPits(int pits) {
            this.pits = pits;
        }

        public static void getAmount(){
            FruitTask1 fruitApple = new FruitTask1("Apple", "yellow", new FruitPits(5));
            System.out.println(fruitApple);
            System.out.println(fruitApple.fruitPits);
        }

        @Override
        public String toString() {
            return "FruitPits{" +
                    "pits=" + pits +
                    '}';
        }
    }
}

class FruitTask1Main {
    public static void main(String[] args) {
        FruitTask1.FruitPits.getAmount();
    }
}

