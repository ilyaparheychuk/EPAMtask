package by.epam.training.fundamental;

import java.util.Scanner;

public class OptionalTask {

    public static void main(String[] args) {
        System.out.println("Insert the size of your array:  ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int mas[] = new int[size];
        int numbers[] = new int[size];
        System.out.println();
        System.out.println("Insert numbers:  ");

        for (int i = 0; i < size; i++) {
            mas[i] = scan.nextInt();
            numbers[i] = (mas[i] + "").length();
        }

        //Task 1
        int max = numbers[0];
        int min = numbers[0];
        int big = 0;
        int small = 0;
        for (int i = 1; i < size; i++) {
            int j = numbers[i];
            if (min > j) {
                min = j;
                small = i;
            } else {
                if (max < j) {
                    max = j;
                    big = i;
                }
            }
        }
        System.out.println();
        System.out.println("The first the shortest: " + mas[small] + "." + " Its lenght: " + min + ";");
        System.out.println("The first the longest: " + mas[big] + "." + " Its lenght: " + max + ";");

        //Task 3
        float value = 0;
        for (int i = 0; i < size; i++) {
            value = value + numbers[i];
        }

        value = value / size;
        System.out.print("Numbers are shorter then average: ");
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (value < numbers[i]) {
                System.out.println("Number: " + mas[i] + "." + " Its lenght: " + numbers[i] + ";");
            }
        }

        // Task6
        int number;
        boolean ascendingOrder;
        for (int i = 0; i < size; i++) {
            int j = 0;
            ascendingOrder = false;
            int[] array = new int[numbers[i]];
            number = mas[i];
            while (number != 0) {
                array[j] = number % 10;
                number = number / 10;
                if (array[j] > number % 10) {
                    ascendingOrder = true;
                } else {
                    ascendingOrder = false;
                    break;
                }
                j++;
            }
            if (ascendingOrder == true) {
                System.out.println("Number is where digits in ascending order: " + mas[i] + ";");
            } else {
                System.out.println("In  " + (i + 1)
                        + " Number is where digits in ascending order NOT FOUNDED;");
            }
        }
    }
}
