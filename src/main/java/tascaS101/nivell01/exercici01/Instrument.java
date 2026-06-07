package tascaS101.nivell01.exercici01;

// Abstract class
public abstract class Instrument {

    // Declare attributes
    private String name;
    private double price;

    // Static block test
    static{
        System.out.println("Això és un bloc estàtic");
    }

    // Initialization block test

    {
        System.out.println("Es crea un nou objecte");
    }

    // Constructor
    public Instrument(String name, double price){
        // Check input data
        checkInputs(name, price);
        // Initialize attributes
        this.name = name;
        this.price = price;
    }

    // Check inputs method implementation
    private void checkInputs(String name, double price){
        if(name == null)throw new IllegalArgumentException("Name must not be NULL");
        if(price < 0)throw new IllegalArgumentException("Price must not be a negative value");
    }

    // Setters
    void setname(String name){
        this.name = name;
    }

    void setPrice(double price){
        this.price = price;
    }

    // Getters
    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    // Declare abstract method
    public abstract void play();
}
