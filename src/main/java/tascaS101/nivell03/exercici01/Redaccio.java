package tascaS101.nivell03.exercici01;

import java.util.ArrayList;

// Declare Redacció Class
public class Redaccio {

    // Declare attributes
    private ArrayList<Redactor> redactors;

    // Constructor
    public Redaccio(){
        this.redactors = new ArrayList<>();
    }

    // Getters
    public ArrayList<Redactor> getEditors() {
        return redactors;
    }

    // Add editor
    public void addEditor(Redactor redactor){
        this.redactors.add(redactor);
    }

    // Return editor index by nif. Return -1 if not found.
    public int findEditorByNif(String nif){
        // Declare variables
        int pos, i;
        boolean found = false;
        // Initialize variables
        pos = -1;
        i = 0;
        // Traverse editor's collection until a matching nif is found
        while( i < this.redactors.size() && !found){
            if(this.redactors.get(i).getNif().equalsIgnoreCase(nif)){
                pos = i;
                found = true;
            }
            i++;
        }
        return pos;
    }

    // Remove editor with matching nif
    public void removeEditor(String nif){
        this.redactors.remove(findEditorByNif(nif));
    }

    // Get news piece by header
    public Noticia getNewsByHeader(String titular){
        boolean found = false;
        int i = 0;
        Noticia foundNewsPiece = null;

        while(i < this.redactors.size() && !found){
            int pos = this.redactors.get(i).findNewsByHeader(titular);

            if(pos >= 0){
                foundNewsPiece = this.redactors.get(i).getNewsByHeader(titular);
                found = true;
            }
            i++;
        }
        return foundNewsPiece;
    }
}
