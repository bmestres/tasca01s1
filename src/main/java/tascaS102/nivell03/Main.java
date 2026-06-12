package tascaS102.nivell03;

public class Main {

    static void main(String[] args) {

        System.out.println(Message.U_WELCOME);
        int numRows = ConsoleReader.readInt(Message.U_ENTER_ROWS);
        int numSitsPerRow = ConsoleReader.readInt(Message.U_ENTER_SITS_PER_RAW);

        ReservationService service = new ReservationService(numRows, numSitsPerRow);
        ConsoleUI console = new ConsoleUI(service);

        console.start();

    }
}
