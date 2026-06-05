package nivell03.exercici01;

// Define subclass Noticia F1
public class NoticiaF1 extends Noticia {

    // Define constants
    private static final double preuBase = 100;
    private static final int puntuacioBase = 4;

    // Declare attributes
    private String escuderia;

    // Constructor
    public NoticiaF1(String titular, String escuderia) {

        // Initialize superclass
        super(titular);

        // Check input data
        checkInputs(escuderia);

        // Initialize attributes
        this.escuderia = escuderia;

        // Set price and score by calling compute methods
        this.setPreu(this.computePrice());
        this.setPuntuacio(this.computeScore());
    }

    // Define checkInputs method
    private void checkInputs(String escuderia) {

        if (escuderia == null) {
            throw new IllegalArgumentException("Escuderia must not be NULL");
        }
    }
        // Define compute price method for NoticiaF1
        @Override
        public double computePrice () {
            // Initialize accumulator
            double totalPreu = this.preuBase;

            // Update accumulator if player matches requirement
            if (this.escuderia.equalsIgnoreCase("Ferrari") ||
                    this.escuderia.equalsIgnoreCase("Mercedes")) {
                totalPreu += 50;
            }
            return totalPreu;
        }
        // Define compute score method for NoticiaF1
        @Override
        public int computeScore() {
            // Initialize accumulator
            int totalPuntuacio = puntuacioBase;

            if (this.escuderia.equalsIgnoreCase("Ferrari") ||
                    this.escuderia.equalsIgnoreCase("Mercedes")) {
                totalPuntuacio += 2;
            }
            return totalPuntuacio;
        }
    }
