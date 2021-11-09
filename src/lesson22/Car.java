package lesson22;

import java.util.Objects;

public abstract class Car {
    private String brandCar;
    private String modelCar;
    private int yearCar;
    private String colorCar;
    private int numberCar;

    public Car(){
    }

    public Car(String brandCar, String modelCar, int yearCar, String colorCar, int numberCar) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.yearCar = yearCar;
        this.colorCar = colorCar;
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandCar='" + brandCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", yearCar=" + yearCar +
                ", colorCar='" + colorCar + '\'' +
                ", roomCar=" + numberCar +
                '}';
    }

    @Override
    public boolean equals(Object objCar) {
        if (this == objCar) {
            return true;
        }
        if (objCar == null || getClass() != objCar.getClass()) {
            return false;
        }
        Car car = (Car) objCar;
        return yearCar == car.yearCar && numberCar == car.numberCar && Objects.equals(brandCar, car.brandCar)
                && Objects.equals(modelCar, car.modelCar) && Objects.equals(colorCar, car.colorCar);
    }

    @Override
    public int hashCode() {
        return brandCar.hashCode() + modelCar.hashCode() + yearCar + colorCar.hashCode() + numberCar;
    }
}
