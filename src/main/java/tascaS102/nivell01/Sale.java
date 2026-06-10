package tascaS102.nivell01;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product>productsList;
    private double totalPrice;

    public Sale(){
        this.productsList = new ArrayList<Product>();
    }

    // Getters
    public ArrayList<Product> getProductList(){
        return this.productsList;
    }

    public void calculateTotal(ArrayList<Product>productsList) throws EmptySaleException{

        // Define exception handling message
        if(productsList.isEmpty()){
            throw new EmptySaleException("Must first add products in order to make a sell.");
        }
        double sum = 0;
            for(int i = 0; i < productsList.size(); i++){
                sum += productsList.get(i).getPrice();
            }
            this.totalPrice = sum;
        }
}
