package by.epam.training.threads;

public class Car {

    private String carNumber;

    public Car() {
        this.carNumber = GeneratorRandom.generationNewNumberOfCar();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
