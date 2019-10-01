package JavaFundamental;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:  ");
        String name = scanner.nextLine();
        System.out.println("Enter size of array(from 1 to 12):  ");
        int size = scanner.nextInt();

        //1
        System.out.println("Hello    " + name);

        //2   REVERSE
        String reverseName = new StringBuffer(name).reverse().toString();
        System.out.println("Reverse    " + reverseName);

        //3   ARRAY
        int[] mas = new int[size];
        for (int i = 0; i<mas.length; i++){
            mas[i] = (int)(Math.random()*20);
            System.out.print(mas[i] + "  ");
        }
        System.out.println();

        //4
        int sum = 0;
        for(int i = 0; i<mas.length; i++){
            sum += mas[i];
        }
        System.out.println("SUM = " + sum);

        //5
        switch (size) {
            case 1: System.out.println("January");break;
            case 2: System.out.println("February");break;
            case 3: System.out.println("March");break;
            case 4: System.out.println("April");break;
            case 5: System.out.println("May");break;
            case 6: System.out.println("June");break;
            case 7: System.out.println("July");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("September");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("December");break;
        }
    }
}
