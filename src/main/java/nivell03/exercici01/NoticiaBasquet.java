package nivell03.exercici01;

// Define subclass NoticiaBasquet
public class NoticiaBasquet extends Noticia{

    // Define constants
    private static final double preuBase = 250;
    private static final int puntuacioBase = 4;

    // Declare attributes
    private String competicio;
    private String club;

    // Constructor
    public NoticiaBasquet(String titular, String competicio, String club) {

        // Initialize superclass
        super(titular);

        // Check input data
        checkInputs(competicio, club);

        // Initialize attributes
        this.competicio = competicio;
        this.club = club;

        // Set price and score by calling compute methods
        this.setPreu(this.computePrice());
        this.setPuntuacio(this.computeScore());
    }

    // Define checkInputs method
    private void checkInputs(String competicio, String club) {

        if (competicio == null) {
            throw new IllegalArgumentException("Competició must not be NULL");
        }
        if (club == null) {
            throw new IllegalArgumentException("Club must not be NULL");
        }
    }
    // Define compute price method for NoticiaFutbol
    @Override
    public double computePrice(){
        // Initialize accumulator
        double totalPreu = this.preuBase;

        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            totalPreu += 75;
        }

        if(this.competicio.equalsIgnoreCase("Eurolliga")){
            totalPreu += 75;
        }
        return totalPreu;
    }

    // Define compute score method for NoticiaFutbol
    @Override
    public int computeScore(){
        // Initialize accumulator
        int totalPuntuacio = puntuacioBase;

        // Update accumulator if competition matches requirement
        if(this.competicio.equalsIgnoreCase("Eurolliga")){
            totalPuntuacio += 3;
        } else if (this.competicio.equalsIgnoreCase("ACB")) {
            totalPuntuacio += 2;
        }
        // Update accumulator if club matches requirement
        if(this.club.equalsIgnoreCase("Barça")
                || this.club.equalsIgnoreCase("Madrid")){
            totalPuntuacio += 1;
        }
        return totalPuntuacio;
    }
}


