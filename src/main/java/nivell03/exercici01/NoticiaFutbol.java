package nivell03.exercici01;

// Define subclass NoticiaFutbol
public class NoticiaFutbol extends Noticia {

    // Define constants
    private static final double preuBase = 300;
    private static final int puntuacioBase = 5;

    // Declare attributes
    private String competicio;
    private String club;
    private String jugador;

    // Constructor
    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        // Initialize superclass
        super(titular);
        // Check input data
        checkInputs(competicio, club, jugador);
        // Initialize attributes
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
        // Set price and score by calling compute methods
        this.setPreu(this.computePrice());
        this.setPuntuacio(this.computeScore());
    }

    // Define checkInputs method
    private void checkInputs(String competicio, String club, String jugador) {
        if (competicio == null) {
            throw new IllegalArgumentException("Competicio must not be NULL");
        }
        if (club == null) {
            throw new IllegalArgumentException("Club must not be NULL");
        }
        if (jugador == null) {
            throw new IllegalArgumentException("Jugador must not be NULL");
        }
    }
    // Define compute price method for NoticiaFutbol
    @Override
    public double computePrice(){
        // Initialize accumulator
        double totalPreu = this.preuBase;
        // Update accumulator if club matches requirement
        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            totalPreu += 100;
        }
        // Update accumulator if competition matches requirement
        if(this.competicio.equalsIgnoreCase("Lliga de campions")){
            totalPreu += 100;
        }
        // Update accumulator if player matches requirement
        if(this.jugador.equalsIgnoreCase("Ferran Torres") ||
                this.jugador.equalsIgnoreCase("Benzema")){
            totalPreu += 50;
        }
        return totalPreu;
    }

    // Define compute score method for NoticiaFutbol
    @Override
    public int computeScore(){
        // Initialize accumulator
        int totalPuntuacio = puntuacioBase;

        // Update accumulator if competition matches requirement
        if(this.competicio.equalsIgnoreCase("Lliga de campions")){
            totalPuntuacio += 3;
        } else if (this.competicio.equalsIgnoreCase("Lliga")) {
            totalPuntuacio += 2;
        }
        // Update accumulator if club matches requirement
        if(this.club.equalsIgnoreCase("Barça")
                || this.club.equalsIgnoreCase("Madrid")){
            totalPuntuacio += 1;
        }
        // Update accumulator if player matches requirement
        if(this.jugador.equalsIgnoreCase("Ferran Torres")
                || this.jugador.equalsIgnoreCase("Benzema")){
            totalPuntuacio += 1;
        }
        return totalPuntuacio;
    }
    // Format Football news info to string
    @Override
    public String toString(){
        return String.format("Titular: %s\nCompetició: %s\nClub: %s\nJugador: %s\nPuntuació: %f.1\nPreu: %d\nText: %s\n",
                this.getTitular(), this.competicio, this.club, this.jugador, this.getPuntuacio(), this.getPreu(), this.getText());
    }
}




