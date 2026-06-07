package tascaS101.nivell01.exercici01;
// Concrete subclass
public class PercussionInstrument extends Instrument{

    // Constructor
    public PercussionInstrument(String name, double price){
        // Initialize superclass
        super(name, price);
    }

    // Implement sublass play action
    @Override
    public void play(){
        System.out.println("Està sonant un instrument de percussió");
    }
}
