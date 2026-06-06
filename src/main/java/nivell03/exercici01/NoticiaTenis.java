package nivell03.exercici01;

import java.util.ArrayList;

//
public class NoticiaTenis extends Noticia{

    // Define constants
    private static final double preuBase = 150;
    private static final int puntuacioBase = 4;

    // Declare attributes
    private String competicio;
    private ArrayList<String> tenistes;

    // Constructor
    public NoticiaTenis(String titular, String competicio, ArrayList<String>tenistes) {
        // Initialize superclass
        super(titular);
        // Check input data
        checkInputs(competicio, tenistes);
        // Initialize attributes
        this.competicio = competicio;
        this.tenistes = tenistes;
        // Set price and score by calling compute methods
        this.setPreu(this.computePrice());
        this.setPuntuacio(this.computeScore());
    }

    // Define checkInputs method
    private void checkInputs(String competicio, ArrayList<String>tenistes) {
        if (competicio == null) {
            throw new IllegalArgumentException("Competicio must not be NULL");
        }
        if(tenistes == null) {
            throw new IllegalArgumentException("Tenistes must not be NULL");
        }
    }
    // Define compute price method for NoticiaFutbol
    @Override
    public double computePrice(){
        // Initialize accumulator
        double totalPreu = this.preuBase;
        // Current list element
        String currentTennist;
        // Set index and flag
        boolean found = false;
        int i = 0;
        // Traverse players list and find special players
        while(i < this.tenistes.size() && !found) {
            currentTennist = this.tenistes.get(i);
            if(currentTennist.equalsIgnoreCase("Federer")
                    || currentTennist.equalsIgnoreCase("Nadal")
                    || currentTennist.equalsIgnoreCase("Djokovic")){
                found = true;
                i++;
            }
            // Update accumulator any of the requested players is found
            if(found = true){
                totalPreu += 150;
            }
        }
        return totalPreu;
    }
    // Define compute score method for NoticiaFutbol
    @Override
    public int computeScore(){
        // Initialize accumulator
        int totalPuntuacio = puntuacioBase;
        // Current list element
        String currentTennist;
        // Set index and flag
        boolean found = false;
        int i = 0;
        // Traverse players list and find special players
        while(i < this.tenistes.size() && !found) {
            currentTennist = this.tenistes.get(i);
            if(currentTennist.equalsIgnoreCase("Federer")
                    || currentTennist.equalsIgnoreCase("Nadal")
                    || currentTennist.equalsIgnoreCase("Djokovic")){
                found = true;
                i++;
            }
            // Update accumulator any of the requested players is found
            if(found = true){
                totalPuntuacio += 150;
            }
        }
        return totalPuntuacio;
    }
    // Format Tennis news info to String
    @Override
    public String toString(){
        // CSV format players to String
        String formatedTennists = String.join(", ", this.tenistes);

        return String.format("Titular: %s\nCompetició: %s\nTenistes: %s\nPuntuació: %f.1\nPreu: %d\nText: %s\n",
                this.getTitular(), this.competicio, formatedTennists, this.getPuntuacio(), this.getPreu(), this.getText());
    }
}
