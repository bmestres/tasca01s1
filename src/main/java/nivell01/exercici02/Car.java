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

    public void print(){
        System.out.println("Car attributes:");
        System.out.printf("Brand: %s\n",Car.brand);
        System.out.printf("Model: %s\n", Car.model);
        System.out.printf("Power: %.1f\n", this.power);
    }
}
