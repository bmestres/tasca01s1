package tascaS101.nivell02.exercici01;

public class Main {

    static void main(String[] args) {

        Smartphone smartphone01 = new Smartphone("iPhone", "17");
        // Call calling method
        smartphone01.makeCall("6557893");

        // Call take picture method
        smartphone01.takePicture();

        // Call ring alarm method
        smartphone01.ringAlarm();

    }
}
