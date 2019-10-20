package by.epam.training.threads;

import java.util.Random;

public class GeneratorRandom {

    private static final Random random = new Random();

    public static int universalRandom(int i) {
        return random.nextInt(i) + 1;
    }

    public static String generationNewNumberOfCar() {
        int number = (int) (Math.random() * 8999) + 1000;
        char one = (char) (random.nextInt(26) + 'A');
        char two = (char) (random.nextInt(26) + 'A');
        String numberOfCar = ("[" + number + " " + one + two + "-7]");
        return numberOfCar;
    }
}
