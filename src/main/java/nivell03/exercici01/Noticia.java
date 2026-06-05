package nivell03.exercici01;

// Create abstract class Noticia
public abstract class Noticia {

    // Declare attributes
    private String titular;
    private String text;
    private int puntuacio;
    private double preu;

    // Constructor
    public Noticia(String titular){

        // Check input data
        checkInputs(titular);

        // Initialize attributes
        this.titular = titular;
    }
    // Define checkInputs method
    private void checkInputs(String titular){
        if(titular == null){
            throw new IllegalArgumentException("Titular must not be NULL");
        }
    }
    // Declare abstract methods
    public abstract double computePrice();
    public abstract int computeScore();
}
