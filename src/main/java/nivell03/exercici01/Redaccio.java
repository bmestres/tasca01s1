package nivell03.exercici01;

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
        }
        return pos;
    }

    // Remove editor with matching nif
    public void removeEditor(String nif){
        this.redactors.remove(findEditorByNif(nif));
    }
}
