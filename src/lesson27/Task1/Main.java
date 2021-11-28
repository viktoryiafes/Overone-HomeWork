package lesson27.Task1;

public class Main {
    public static void main(String[] args) {
        IShape getTriangleArea = x -> (x * x * x) / (4 * x);
        IShape getCircleArea = x -> Math.PI * x * x /4;
        IShape getSquareArea = x -> x * x;

        double triangleRadius = 5;
        double triangleArea = getTriangleArea.getSquare(triangleRadius);
        System.out.println(triangleArea);

        double circleDiameter = 18.92;
        double circleArea = getCircleArea.getSquare(circleDiameter);
        System.out.println(circleArea);

        double squareSide = 3;
        double squareArea = getSquareArea.getSquare(squareSide);
        System.out.println(squareArea);
    }
}
