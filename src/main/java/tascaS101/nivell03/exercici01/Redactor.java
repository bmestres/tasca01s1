package tascaS101.nivell03.exercici01;

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

    // Getters
    public String getNif(){
        return this.nif;
    }
    public String getName(){
        return this.nom;
    }
    // Setters
    public void setNif(String nom){
        this.nom = nom;
    }

    // Add news piece
    public void addNewsPiece(Noticia noticia){
        this.noticies.add(noticia);
    }

    // Return position of a news piece given its header. Return -1 if not found
    public int findNewsByHeader(String titular){
        // Declare variables
        boolean found;
        int i, pos;
        // Initialize variables
        i = 0;
        pos = -1;
        found = false;

        while(i < this.noticies.size() && !found){
            if(titular.equalsIgnoreCase(this.noticies.get(i).getTitular())){
                pos = i;
                found = true;
            }
            i++;
        }
        return pos;
    }
    // Find news piece with a given header. Return NULL if not found
    public Noticia getNewsByHeader(String titular){
        int pos = this.findNewsByHeader(titular);
        Noticia noticia = null;
        if(pos >= 0){
            noticia = this.noticies.get(pos);
        }
        return noticia;
    }

    public void deleteNewsPiece(String titular){
        int pos = this.findNewsByHeader(titular);
        if(pos == -1){
            System.out.println("=== Notícia no trobada ===");
        } else {
            this.noticies.remove(pos);
            System.out.println("=== Notícia eliminada amb exit ===");
        }
    }
    // Show all editor's news pieces on screen
    public void showAllNews(){
        for(int i = 0; i < this.noticies.size(); i++){
            System.out.printf("%s", this.noticies.get(i).toString());
            System.out.println();
        }
    }
    @Override
    public String toString(){
        return String.format("Nom: %s\nNIF: %s\n", this.nom, this.nif);
    }
}
