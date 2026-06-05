package nivell02.exercici01;
// Create subclass Smartphone
public class Smartphone extends Phone implements Camera, Clock {

    // Constructor
    public Smartphone(String brand, String model){

        // Initialize superclass
        super(brand, model);
    }

    @Override
    public void takePicture(){
        System.out.println("S'està fent una foto");
    }

    @Override
    public void ringAlarm(){
        System.out.println("Està sonant l'alarma");
    }


}
