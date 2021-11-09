package lesson22;

public class MainCar {
    public static void main(String[] args) {
        Garage garage = new Garage();

        CompactCar nissanModel2013 = new CompactCar("Nissan Joke I", "Nissan", 2013, "Red", 6523);
        PickupCar poerModel2015 = new PickupCar("Great Wall Poer", "Poer", 2015, "White", 1212);
        SedanCar kiaModelY2018 = new SedanCar("Kia Rio IV", "Kia Rio", 2018, "White", 2525);
        SedanCar ladaModelY2010 = new SedanCar("LADA (ВАЗ) 2107", "Lada", 2010, "Silver", 2575);

        garage.addCarToTheGarage(nissanModel2013, 1);
        garage.addCarToTheGarage(poerModel2015, 4);
        garage.addCarToTheGarage(kiaModelY2018, 5);
        garage.addCarToTheGarage(ladaModelY2010, 8);

        garage.showAll();

        garage.carParking(ladaModelY2010);
        garage.carParking(kiaModelY2018);
        garage.carParking(poerModel2015);

        garage.showAll();

        garage.departureOfTheCar(kiaModelY2018);
        garage.departureOfTheCar(kiaModelY2018);
        garage.departureOfTheCar(nissanModel2013);
        garage.departureOfTheCar(ladaModelY2010);

        garage.showAll();

        System.out.println("Count of 'Kia Rio IV' is " + garage.remainingCarsByType(kiaModelY2018));
    }
}
