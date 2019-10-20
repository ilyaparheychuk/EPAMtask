package by.epam.training.collections.optionaltask;

import java.util.Scanner;
import java.util.Stack;

public class OptionalTaskTwo {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Input number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        char[] numerals = String.valueOf(number).toCharArray();

        for (char numeral : numerals) {
            stack.push(numeral);
        }

        while (!stack.empty()) {
            char stackNumber;
            stackNumber = (Character) stack.pop();
            System.out.print(stackNumber);
        }
    }
}