package nivell03.exercici01;

import java.util.ArrayList;
// Create Redactor class
public class Redactor {

    // Declare variables
    private String nom;
    private final String nif;
    private static double sou = 1500;
    private ArrayList<Noticia> noticies;

    // Constructor
    public Redactor(String nom, String nif){
        // Check input data
        checkInputs(nom, nif);

        // Initialize attributes
        this.nom = nom;
        this.nif = nif;
        this.noticies = new ArrayList<>();
    }

    private void checkInputs(String nom, String nif){
        if(nom == null)throw new IllegalArgumentException("Name must not be NULL");
        if(nif == null)throw new IllegalArgumentException("NIF must not be NULL");
    }
}
