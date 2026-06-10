package tascaS102.nivell01;

public class Product {
    // Attributes
    String name;
    double price;

    public Product(String name, double price){
        checkInputs(name, price);

        this.name = name;
        this.price = price;
    }

    private void checkInputs(String name, double price){
        if(name == null){
            throw new IllegalArgumentException("Name must not be NULL");
        }
        if(price < 0){
            throw new IllegalArgumentException("Price must not be a negative value");
        }
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
}
