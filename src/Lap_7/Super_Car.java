package Lap_7;

import java.util.Scanner;

public class Super_Car {
    public static void main(String[] args) {
        SuperCar superCar1 = new SuperCar();
        superCar1 = inputData(superCar1);
        System.out.println(superCar1.toString());
    }//main

    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your superCar data: ");
        System.out.print("car brand: " );
        s.setBrand(scanner.nextLine());
        System.out.print("car color: ");
        s.setColor(scanner.nextLine());
        System.out.print("car engine size: ");
        s.setEngine(scanner.nextLine());
        System.out.print("max speed: ");
        s.setMaxspeed(scanner.nextLine());
        System.out.print("country of origin: ");
        s.setCountry("scanner.nextLine()");

        return s;

    }
}