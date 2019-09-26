

public class Place {

    private Car car;

    public Place(int numberOfPlace) {
        this.numberOfPlace = numberOfPlace;
    }

    private int numberOfPlace;

    public int getNumberOfPlace() {

        return numberOfPlace;
    }

    public void setNumberOfPlace(int numberOfPlace) {

        this.numberOfPlace = numberOfPlace;
    }



    public Car getCar() {

        return car;
    }

    public void setCar(Car car) {

        this.car = car;
    }
}
