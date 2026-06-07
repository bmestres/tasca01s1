package tascaS101.nivell01.exercici01;

public class Main {

    static void main(String[] args) {

        // Create new Wind Instrument
        WindInstrument instrument01 = new WindInstrument("Horn", 1338.5);
        // Create new String Instrument
        StringInstrument instrument02 = new StringInstrument("Ones Martenot", 4830.75);
        // Create new Percussion Instrument
        PercussionInstrument instrument03 = new PercussionInstrument("Marimba",3248.2 );

        // Call instrument's play action
        instrument01.play();
        instrument02.play();
        instrument03.play();
    }
}
