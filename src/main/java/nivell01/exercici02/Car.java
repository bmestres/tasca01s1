package nivell01.exercici02;

public class Car {

    // Declare attributes
    private static final String brand = "Volvo";
    private static String model;
    private final double power;

    // Constructor
    public Car(String model, double power){
        // Initialize attributes
        Car.model = model;
        this.power = power;
    }

    // Implement method brake
    public static void brake(){
        System.out.println("El vehicle està frenat");
    }
    // Implement method accelerate
    public void accelerate(){
        System.out.println("El vehicle està accelerant");
    }
}
