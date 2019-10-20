package by.epam.training.collections.optionaltask;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Scanner;

public class OptionalTask {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("СollectionsOptionalTaskOne.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<String> lines = new ArrayList<String>();

        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }

        scanner.close();

        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}
