import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;


public class ParkingManager {

    public static void main(String[] args) throws InterruptedException {
        final GeneratorRandom gR = new GeneratorRandom();
        final Parking parking = new Parking(5);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        while (true) {
            executorService.submit(new Runnable() {
                public void run() {
                    Car car = new Car();
                    parking.allCars();
                    try {
                        System.out.println(String.format("Car with number %s looking for place", car.getCarNumber()));
                        Place place = parking.getParkingPlaces().poll(1, TimeUnit.SECONDS);
                        if (place != null) {
                            System.out.println(String.format("Car with number %s found place %d", car.getCarNumber(),
                                    place.getNumberOfPlace()));
                            place.setCar(car);
                            Thread.sleep(GeneratorRandom.universal(10) * 1000);
                            place.setCar(null);
                            System.out.println(String.format("Car with number %s make place %d free", car.getCarNumber(),
                                    place.getNumberOfPlace()));
                            parking.getParkingPlaces().offer(place);
                        }
                        else{
                            System.out.println(String.format("Car with number %s goes away because timeout", car.getCarNumber()));
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
           Thread.sleep(1000);
        }
    }

}
