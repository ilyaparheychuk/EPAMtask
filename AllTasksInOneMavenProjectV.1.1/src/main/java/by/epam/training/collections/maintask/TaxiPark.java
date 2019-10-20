package by.epam.training.collections.maintask;

import by.epam.training.collections.maintask.Cars.Car;
import by.epam.training.collections.maintask.Cars.Minivan;
import by.epam.training.collections.maintask.Cars.Standard;

import java.util.*;

public class TaxiPark {

    private List<? extends Car> cars;

    public List<Standard> getStandardCar() {
        List<? extends Car> allCar = this.cars;
        List<Standard> standardCar = new ArrayList<Standard>();
        for (Car car : allCar) {
            if (car instanceof Standard) {
                standardCar.add((Standard) car);
            }
        }
        return standardCar;
    }

    public List<Minivan> getMinivanCar() {
        List<? extends Car> allCar = this.cars;
        List<Minivan> minivanCar = new ArrayList<Minivan>();
        for (Car car : allCar) {
            if (car instanceof Minivan) {
                minivanCar.add((Minivan) car);
            }
        }
        return minivanCar;
    }

    public int getCostOfAllMinivanCars() {
        List<Minivan> minivanCars = getMinivanCar();
        int costOfAllMinivanCars = 0;
        for (int i = 0; i < minivanCars.size(); i++) {
            costOfAllMinivanCars = minivanCars.get(i).getCarCost() + costOfAllMinivanCars;
        }
        return costOfAllMinivanCars;
    }

    public int getCostOfAllStandardCars() {
        List<Standard> standardCars = getStandardCar();
        int costOfAllStandardCars = 0;
        for (int i = 0; i < standardCars.size(); i++) {
            costOfAllStandardCars = standardCars.get(i).getCarCost() + costOfAllStandardCars;
        }
        return costOfAllStandardCars;
    }

    public TaxiPark sortByConsumptionFuel() {
        Collections.sort(cars, new Comparator<Car>() {
            public int compare(Car minivan, Car standard) {
                return Double.compare(minivan.getConsumptionFuel(), standard.getConsumptionFuel());
            }
        });
        return this;
    }

    @Override
    public String toString() {
        return cars.toString();
    }

    public TaxiPark(List<? extends Car> cars) {
        this.cars = cars;
    }
}
