package JavaThreads;

import java.util.Random;

public class GeneratorRandom {

    private static final Random random = new Random();

    public static int universal(int a){
        return  random.nextInt(a)+1;
    }

    public static String generationNewNumberOfCar(){

        Random r = new Random();
        int number = (int)(Math.random()*8999)+1000;
        char one = (char)(r.nextInt(26) + 'A');
        char two = (char)(r.nextInt(26) + 'A');
        String numberOfCar =("["+number+" "+one+two+"-7]");
        return numberOfCar;
    }
}
