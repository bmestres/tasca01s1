package tascaS101.nivell02.exercici01;
// Create superclass Phone
public class Phone {
    // Define attributes
    private String brand;
    private String model;

    // Constructor
    public Phone(String brand, String model){

        // Check input data
        checkInputs(brand, model);

        // Initialize attributes
        this.brand = brand;
        this.model = model;
    }

    // Check inputs method
    private void checkInputs(String brand, String model){
        if(brand == null)throw new IllegalArgumentException("Brand must not be NULL");
        if(model == null)throw new IllegalArgumentException("Model must not be NULL");
    }

    // Setters
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    // Getters
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    // Implement call method
    public void makeCall(String number){
        System.out.printf("Trucant a %s\n", number);
    }
}
