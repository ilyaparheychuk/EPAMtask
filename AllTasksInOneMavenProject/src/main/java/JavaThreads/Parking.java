package JavaThreads;

import java.util.concurrent.ArrayBlockingQueue;

public class Parking {

   private ArrayBlockingQueue<Place> parkingPlaces;

    public Parking(int capacity) {
        this.parkingPlaces = new ArrayBlockingQueue<Place>(capacity);
        for(int i=0;i<capacity;i++){
            parkingPlaces.add(new Place(i));
        }
    }

    public ArrayBlockingQueue<Place> getParkingPlaces() {
        return parkingPlaces;
    }

    public void allCars(){

        StringBuffer stringBuffer = new StringBuffer();
        for(Place place: parkingPlaces){
            stringBuffer.append(String.format("Place %d is free \n", place.getNumberOfPlace()));
        }
        System.out.println(stringBuffer.toString());
    }
}
