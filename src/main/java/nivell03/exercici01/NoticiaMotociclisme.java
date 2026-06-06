package nivell03.exercici01;

// Define subclass Noticia Motociclisme
public class NoticiaMotociclisme extends Noticia {

    // Define constants
    private static final double preuBase = 100;
    private static final int puntuacioBase = 3;

    // Declare attributes
    private String equip;

    // Constructor
    public NoticiaMotociclisme(String titular, String equip) {
        // Initialize superclass
        super(titular);
        // Check input data
        checkInputs(equip);
        // Initialize attributes
        this.equip = equip;

        // Set price and score by calling compute methods
        this.setPreu(this.computePrice());
        this.setPuntuacio(this.computeScore());
    }
    // Define checkInputs method
    private void checkInputs(String equip) {
        if (equip == null) {
            throw new IllegalArgumentException("Equip must not be NULL");
        }
    }
    // Define compute price method for NoticiaFutbol
    @Override
    public double computePrice() {
        // Initialize accumulator
        double totalPreu = this.preuBase;

        // Update accumulator if player matches requirement
        if (this.equip.equalsIgnoreCase("Honda") ||
                this.equip.equalsIgnoreCase("Yamaha")) {
            totalPreu += 50;
        }
        return totalPreu;
    }
    // Define compute score method for NoticiaFutbol
    @Override
    public int computeScore() {
        // Initialize accumulator
        int totalPuntuacio = puntuacioBase;

        // Update accumulator if club matches requirement
        if (this.equip.equalsIgnoreCase("Honda")
                || this.equip.equalsIgnoreCase("Yamaha")) {
            totalPuntuacio += 1;
        }
            return totalPuntuacio;
    }

    // Format Motorcycling news info to string
    @Override
    public String toString(){
        return String.format("Titular: %s\nEquip: %s\nPuntuació: %d\nPreu: %f.1\nText: %s\n",
                this.getTitular(), this.equip, this.getPuntuacio(), this.getPreu(), this.getText());
    }
}
