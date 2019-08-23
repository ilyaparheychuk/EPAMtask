package Cars;

abstract public class Car {
    String model;
    private int carCost;
    private int maxSpeed;
    private double consumptionFuel;
    private int passengersSeats;


    public Car(String model, int carCost, int maxSpeed, double consumptionFuel, int passengersSeats) {
        this.model = model;
        this.carCost = carCost;
        this.maxSpeed = maxSpeed;
        this.consumptionFuel = consumptionFuel;
        this.passengersSeats = passengersSeats;
    }

    public String getModel() {
        return model;
    }

    public int getCarCost () { return carCost;}

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getConsumptionFuel() {
        return consumptionFuel;
    }

    public int getPassengersSeats() { return passengersSeats; }

    @Override
    public String toString() {
        return "\n"+"Car{" +
                " model='" + model + '\'' +
                ", maxSpeed='" + maxSpeed +
                ", carCost=" + carCost +
                ", consumptionFuel=" + consumptionFuel +
                ", passengersSeats=" + passengersSeats +
                '}';
    }


}
