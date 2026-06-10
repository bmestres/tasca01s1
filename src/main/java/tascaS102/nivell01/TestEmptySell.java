package tascaS102.nivell01;

public class TestEmptySell {
    // Tries calling calculateTotal method with an empty list, then catches exception with a custom message
    public static void performTest() {
        Sale sale = new Sale();
        try{
            sale.calculateTotal(sale.getProductList());
        } catch(EmptySaleException ex) {
            System.out.printf("Caught Empty Sale Exception with message: %s\n", ex.getMessage());
        }

    }
}
