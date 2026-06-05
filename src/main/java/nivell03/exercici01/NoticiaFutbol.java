package nivell03.exercici01;

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
        double totalPreu = this.preuBase;

        if(this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            totalPreu += 100;
        }

        if(this.competicio.equalsIgnoreCase("Lliga de campions")){
            totalPreu += 100;
        }

        if(this.jugador.equalsIgnoreCase("Ferran Torres") ||
                this.jugador.equalsIgnoreCase("Benzema")){
            totalPreu += 50;
        }
        return totalPreu;
    }

    // Define compute score method for NoticiaFutbol
    @Override
    public int computeScore(){
        int totalPuntuacio = puntuacioBase;

        if(this.competicio.equalsIgnoreCase("Lliga de campions")){
            totalPuntuacio += 3;
        } else if (this.competicio.equalsIgnoreCase("Lliga")) {
            totalPuntuacio += 2;
        }
        if(this.club.equalsIgnoreCase("Barça")
                || this.club.equalsIgnoreCase("Madrid")){
            totalPuntuacio += 1;
        }
        if(this.jugador.equalsIgnoreCase("Ferran Torres")
                || this.jugador.equalsIgnoreCase("Benzema")){
            totalPuntuacio += 1;
        }
        return totalPuntuacio;
    }
}




