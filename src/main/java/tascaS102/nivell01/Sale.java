package tascaS102.nivell01;

import java.util.ArrayList;

public class Sale {
    // Attributes
    ArrayList<Product>productsList;
    double totalPrice;

    public Sale(){
        this.productsList = new ArrayList<Product>();
    }

    public double calculateTotal(ArrayList<Product>productsList){

            for(int i = 0; i < productsList.size(); i++){
                totalPrice += productsList.get(i).getPrice();
            }
            return totalPrice;

        }
}
