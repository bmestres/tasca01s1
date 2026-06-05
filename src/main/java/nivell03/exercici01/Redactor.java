package nivell03.exercici01;

import java.util.ArrayList;

public class Redactor {

    // Declare variables
    private String nom;
    private final String nif;
    private static double sou = 1500;
    private ArrayList<Noticia> noticies;

    // Constructor
    public Redactor(String nom, String nif){
        this.nom = nom;
        this.nif = nif;
        this.noticies = new ArrayList<>();
    }
}
