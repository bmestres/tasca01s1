package tascaS101.nivell01.exercici02;

import static tascaS101.nivell01.exercici02.Car.brake;

public class Main {

    static void main(String[] args) {

        // Call brake static method
        brake();
        System.out.println();

        // Create car object
        Car car01 = new Car("EX60", 600.5);

        // Call accelerate method
        car01.accelerate();
        System.out.println();

        // Show car 1 data
        System.out.println("This is car 1 data:");
        car01.print();
        System.out.println();

        // Create new car object changing model
        Car car02 = new Car("V40", 360.3);

        // Show car 1 and car 2 data after model change
        System.out.println("This is car 1 and car 2 data after changing model:");
        System.out.println();
        car01.print();
        System.out.println();
        car02.print();
        System.out.println();
    }
}
