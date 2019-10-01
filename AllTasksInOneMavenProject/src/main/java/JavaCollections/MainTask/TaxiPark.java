package JavaCollections.MainTask;

import JavaCollections.MainTask.Cars.Car;
import JavaCollections.MainTask.Cars.Minivan;
import JavaCollections.MainTask.Cars.Standard;

import java.util.*;

public class TaxiPark {

    private List<? extends Car> cars;

    public List<Standard> getStandardCar() {
        List<? extends Car> allCar = this.cars;
        List<Standard> standardCar = new ArrayList<>();
        for (Car car : allCar) {if (car instanceof Standard) {standardCar.add((Standard) car);}}
        return standardCar;
    }

    public List<Minivan> getMinivanCar() {
        List<? extends Car> allCar = this.cars;
        List<Minivan> minivanCar = new ArrayList<>();
        for (Car car : allCar) {if (car instanceof Minivan) {minivanCar.add((Minivan) car);}}
        return minivanCar;
    }

    public int getCostOfAllMinivanCars(){
        List<Minivan> minivanCars = getMinivanCar();
        int costOfAllMinivanCars = 0;
        for (int i = 0; i < minivanCars.size(); i++) {
           costOfAllMinivanCars = minivanCars.get(i).getCarCost() + costOfAllMinivanCars;
        }
        return costOfAllMinivanCars;
    }

    public int getCostOfAllStandardCars(){
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

    public List<? extends Car> getCars() {
        return cars;
    }

    private void print(Collection<? extends Car> collection) {
        Iterator<? extends Car> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return cars.toString();
    }

    public TaxiPark(List<? extends Car> cars) {
        this.cars = cars;
    }
}
