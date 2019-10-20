package by.epam.training.collections.maintask;

import by.epam.training.collections.maintask.Cars.Car;
import by.epam.training.collections.maintask.Cars.Minivan;
import by.epam.training.collections.maintask.Cars.Standard;

import java.util.Arrays;
import java.util.List;

public class Runner {

    static List<Car> cars = Arrays.asList(
            new Minivan("Mersedes V-class", 20000, 180, 10.5, 7),
            new Minivan("Peugeot 5008", 10000, 150, 7.5, 6),
            new Minivan("Volkswagen Touran", 15000, 170, 8.5, 7),
            new Standard("Lada Kalina", 7000, 160, 10.1, 4),
            new Standard("Renault Logan", 7300, 160, 7.1, 4),
            new Standard("Volkswagen Polo", 9000, 170, 6.5, 4)
    );

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark(cars);
        TaxiPark standardCar = new TaxiPark(taxiPark.getStandardCar());
        TaxiPark minivanCar = new TaxiPark(taxiPark.getMinivanCar());

        System.out.println("Minivan cars: " + minivanCar + "\n" + "Standard cars: " + standardCar);
        System.out.println("CostOfAllCars:  " + (minivanCar.getCostOfAllMinivanCars() + standardCar.getCostOfAllStandardCars()) + " EURO");
        System.out.println("Sort by consumption fuel: " + taxiPark.sortByConsumptionFuel());

        System.out.println("RangeOfSpeed: ");
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getMaxSpeed() >= 165 && cars.get(i).getMaxSpeed() <= 175) {
                System.out.println(cars.get(i));
            }
        }
    }
}
