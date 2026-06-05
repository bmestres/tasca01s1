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
        this.text = "";
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

    // Setters
    public void setText(String text){
        this.text = text;
    }

    public void setPreu(double preu){
        this.preu = preu;
    }

    public void setPuntuacio(int puntuacio){
        this.puntuacio = puntuacio;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    // Getters
    public String getText(){
        return this.text;
    }

    public double getPreu(){
        return this.preu;
    }

    public int getPuntuacio(){
        return this.puntuacio;
    }

    public String getTitular(){
        return this.titular;
    }
}
